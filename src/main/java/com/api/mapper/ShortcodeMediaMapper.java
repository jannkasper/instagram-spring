package com.api.mapper;

import com.api.model.*;
import com.domain.DisplayResource;
import com.domain.Edge;
import com.domain.NodePost;
import com.domain.ShortcodeMedia;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ShortcodeMediaMapper implements Converter<ShortcodeMedia, ShortcodeMediaDTO> {

    @Override
    public ShortcodeMediaDTO convert(ShortcodeMedia source) {
        if (source == null) {
            return null;
        }
        final ShortcodeMediaDTO shortcode_mediaDTO = new ShortcodeMediaDTO();
        shortcode_mediaDTO.setId(source.getId());
        shortcode_mediaDTO.setShortcode(source.getShortcode());
        shortcode_mediaDTO.setIsVideo(source.getIs_video());
        shortcode_mediaDTO.setIsSidecar(source.getEdge_sidecar_to_children() != null);
        shortcode_mediaDTO.setVideoUrl(source.getVideo_url());
        shortcode_mediaDTO.setCreatedAt(source.getTaken_at_timestamp());
        shortcode_mediaDTO.setViewerHasLiked(source.getViewer_has_liked());
        shortcode_mediaDTO.setViewerHasSaved(source.getViewer_has_saved());

        if (source.getEdge_media_to_caption() != null && !source.getEdge_media_to_caption().getEdges().isEmpty()) {
            final String description = source.getEdge_media_to_caption().getEdges().stream().findFirst().get().getNode().getText();
            shortcode_mediaDTO.setDescription(description);
        }

        if (source.getOwner() != null) {
            OwnerMapper converter = new OwnerMapper();
            final OwnerDTO ownerDTO = converter.convert(source.getOwner());
            shortcode_mediaDTO.setOwner(ownerDTO);
        }

        if (source.getLocation() != null) {
            LocationMapper converter = new LocationMapper();
            final LocationDTO locationDTO = converter.convert(source.getLocation());
            shortcode_mediaDTO.setLocation(locationDTO);
        }

        if (source.getEdge_media_preview_like() != null) {
            EdgeListLikeMapper converter = new EdgeListLikeMapper();
            final EdgeListLikeDTO edgeListLikeDTO = converter.convert(source.getEdge_media_preview_like());
            shortcode_mediaDTO.setLikes(edgeListLikeDTO);
        }

        if (source.getDisplay_resources() != null) {
            shortcode_mediaDTO.setResourceArray(new ArrayList<>());
            DisplayResourceMapper converter = new DisplayResourceMapper();
            for (DisplayResource display_resource : source.getDisplay_resources()) {
                final DisplayResourceDTO displayResourceDTO = converter.convert(display_resource);
                shortcode_mediaDTO.getResourceArray().add(displayResourceDTO);
            }
        }

        if (source.getEdge_media_to_parent_comment() != null) {
            EdgeListCommentMapper converter  = new EdgeListCommentMapper();
            final EdgeListCommentDTO edgeListCommentDTO = converter.convert(source.getEdge_media_to_parent_comment());
            shortcode_mediaDTO.setCommentsData(edgeListCommentDTO);
        }

        if (source.getEdge_sidecar_to_children() != null && source.getEdge_sidecar_to_children().getEdges() != null) {
            shortcode_mediaDTO.setSidecarArray(new ArrayList<>());
            NodeSidecarMapper converter = new NodeSidecarMapper();
            for (Edge<NodePost> edgePost : source.getEdge_sidecar_to_children().getEdges()) {
                final NodeSidecarDTO nodeSidecarDTO = converter.convert(edgePost.getNode());
                shortcode_mediaDTO.getSidecarArray().add(nodeSidecarDTO);
            }
        }

        return shortcode_mediaDTO;
    }
}
