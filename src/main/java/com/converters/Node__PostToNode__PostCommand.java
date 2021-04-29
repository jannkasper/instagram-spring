package com.converters;

import com.api.domain.*;
import com.commands.*;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Node__PostToNode__PostCommand implements Converter<Node_post, Node__PostCommand> {

    @Override
    public Node__PostCommand convert(Node_post source) {
        if (source == null) {
            return null;
        }

        final Node__PostCommand postCommand = new Node__PostCommand();
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
            OwnerToOwnerCommand converter = new OwnerToOwnerCommand();
            final OwnerCommand ownerCommand = converter.convert(source.getOwner());
            postCommand.setOwner(ownerCommand);
        }

        if (source.getLocation() != null) {
            LocationToLocationCommand converter = new LocationToLocationCommand();
            final LocationCommand locationCommand = converter.convert(source.getLocation());
            postCommand.setLocation(locationCommand);
        }

        if (source.getEdge_media_to_caption() != null && !source.getEdge_media_to_caption().getEdges().isEmpty()) {
            final String description = source.getEdge_media_to_caption().getEdges().stream().findFirst().get().getNode().getText();
            postCommand.setDescription(description);
        }

        if (source.getEdge_media_preview_like() != null) {
            Edge_media_preview_likeToEdge_media_preview_likeCommand converter = new Edge_media_preview_likeToEdge_media_preview_likeCommand();
            final Edge_media_preview_likeCommand edge_media_preview_likeCommand = converter.convert(source.getEdge_media_preview_like());
            postCommand.setLikes(edge_media_preview_likeCommand);
        }

        if (source.getDisplay_resources() != null) {
            postCommand.setResourceArray(new ArrayList<>());
            Display_resourceToDisplay_resourceCommand converter = new Display_resourceToDisplay_resourceCommand();
            for (Display_resource display_resource : source.getDisplay_resources()) {
                final Display_resourceCommand display_resourceCommand = converter.convert(display_resource);
                postCommand.getResourceArray().add(display_resourceCommand);
            }
        }

        if (source.getEdge_media_preview_comment() != null) {
            Edge_media_preview_commentToEdge_media_preview_commentCommand converter  = new Edge_media_preview_commentToEdge_media_preview_commentCommand();
            final Edge_media_preview_commentCommand edge_media_preview_commentCommand = converter.convert(source.getEdge_media_preview_comment());
            postCommand.setCommentsData(edge_media_preview_commentCommand);
        }

        if (source.getEdge_sidecar_to_children() != null && source.getEdge_sidecar_to_children().getEdges() != null) {
            postCommand.setSidecarArray(new ArrayList<>());
            Node__PostToNode__SidecarCommand converter = new Node__PostToNode__SidecarCommand();
            for (Edge<Node_post> edge__post : source.getEdge_sidecar_to_children().getEdges()) {
                final Node__SidecarCommand node__sidecarCommand = converter.convert(edge__post.getNode());
                postCommand.getSidecarArray().add(node__sidecarCommand);
            }
        }

        postCommand.setThumbnailSrc(source.getThumbnail_src());

        if (source.getThumbnail_resources() != null) {
            postCommand.setThumbnailArray(new ArrayList<>());
            Thumbnail_resourceToThumbnail_resourceCommand converter = new Thumbnail_resourceToThumbnail_resourceCommand();
            for (Thumbnail_resource thumbnail_resource : source.getThumbnail_resources()) {
                final Thumbnail_resourceCommand thumbnail_resourceCommand = converter.convert(thumbnail_resource);
                postCommand.getThumbnailArray().add(thumbnail_resourceCommand);
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
