package com.api.mapper;

import com.api.model.*;
import com.domain.DisplayResource;
import com.domain.Edge;
import com.domain.NodePost;
import com.domain.ThumbnailResource;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class NodePostMapper implements Converter<NodePost, NodePostDTO> {

    @Override
    public NodePostDTO convert(NodePost source) {
        if (source == null) {
            return null;
        }

        final NodePostDTO postCommand = new NodePostDTO();
        postCommand.setId(source.getId());
        postCommand.setShortcode(source.getShortcode());
        postCommand.setPostId(source.getShortcode());
        postCommand.setIsVideo(source.getIs_video());
        postCommand.setIsSidecar(source.getEdge_sidecar_to_children() != null);
        postCommand.setVideoUrl(source.getVideo_url());
        postCommand.setCreatedAt(source.getTaken_at_timestamp());
        postCommand.setViewerHasLiked(source.getViewer_has_liked());
        postCommand.setViewerHasSaved(source.getViewer_has_saved());

        if (source.getOwner() != null) {
            OwnerMapper converter = new OwnerMapper();
            final OwnerDTO ownerDTO = converter.convert(source.getOwner());
            postCommand.setOwner(ownerDTO);
        }

        if (source.getLocation() != null) {
            LocationMapper converter = new LocationMapper();
            final LocationDTO locationDTO = converter.convert(source.getLocation());
            postCommand.setLocation(locationDTO);
        }

        if (source.getEdge_media_to_caption() != null && !source.getEdge_media_to_caption().getEdges().isEmpty()) {
            final String description = source.getEdge_media_to_caption().getEdges().stream().findFirst().get().getNode().getText();
            postCommand.setDescription(description);
        }

        if (source.getEdge_media_preview_like() != null) {
            EdgeListLikeMapper converter = new EdgeListLikeMapper();
            final EdgeListLikeDTO edgeListLikeDTO = converter.convert(source.getEdge_media_preview_like());
            postCommand.setLikes(edgeListLikeDTO);
        }

        if (source.getDisplay_resources() != null) {
            postCommand.setResourceArray(new ArrayList<>());
            DisplayResourceMapper converter = new DisplayResourceMapper();
            for (DisplayResource display_resource : source.getDisplay_resources()) {
                final DisplayResourceDTO displayResourceDTO = converter.convert(display_resource);
                postCommand.getResourceArray().add(displayResourceDTO);
            }
        }

        if (source.getEdge_media_preview_comment() != null) {
            EdgeListCommentMapper converter  = new EdgeListCommentMapper();
            final EdgeListCommentDTO edgeListCommentDTO = converter.convert(source.getEdge_media_preview_comment());
            postCommand.setCommentsData(edgeListCommentDTO);
        }

        if (source.getEdge_sidecar_to_children() != null && source.getEdge_sidecar_to_children().getEdges() != null) {
            postCommand.setSidecarArray(new ArrayList<>());
            NodeSidecarMapper converter = new NodeSidecarMapper();
            for (Edge<NodePost> edgePost : source.getEdge_sidecar_to_children().getEdges()) {
                final NodeSidecarDTO nodeSidecarDTO = converter.convert(edgePost.getNode());
                postCommand.getSidecarArray().add(nodeSidecarDTO);
            }
        }

        postCommand.setThumbnailSrc(source.getThumbnail_src());

        if (source.getThumbnail_resources() != null) {
            postCommand.setThumbnailArray(new ArrayList<>());
            ThumbnailResourceMapper converter = new ThumbnailResourceMapper();
            for (ThumbnailResource thumbnail_resource : source.getThumbnail_resources()) {
                final ThumbnailResourceDTO thumbnailResourceDTO = converter.convert(thumbnail_resource);
                postCommand.getThumbnailArray().add(thumbnailResourceDTO);
            }
        }

        if (source.getEdge_liked_by() != null) {
            postCommand.setLikeCount(source.getEdge_liked_by().getCount());
        } else if (source.getEdge_media_preview_like() != null) {
            postCommand.setLikeCount(source.getEdge_media_preview_like().getCount());
        }

        if (source.getEdge_media_to_comment() != null) {
            postCommand.setCommentCount(source.getEdge_media_to_comment().getCount());
        }

        return postCommand;
    }
}
