package com.converters;

import com.api.domain.Display_resource;
import com.api.domain.Edge__Post;
import com.api.domain.Shortcode_media;
import com.commands.*;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import static com.constants.MyConstants.URL_PREFIX;

@Component
public class Shortcode_mediaToShortcode_mediaCommand implements Converter<Shortcode_media, Shortcode_mediaCommand> {

    @Override
    public Shortcode_mediaCommand convert(Shortcode_media source) {
        if (source == null) {
            return null;
        }
        final Shortcode_mediaCommand shortcode_mediaCommand = new Shortcode_mediaCommand();
        shortcode_mediaCommand.setId(source.getId());
        shortcode_mediaCommand.setShortcode(source.getShortcode());
        shortcode_mediaCommand.setIsVideo(source.getIs_video());
        shortcode_mediaCommand.setIsSidecar(source.getEdge_sidecar_to_children() != null);
        shortcode_mediaCommand.setVideoUrl(URL_PREFIX + source.getVideo_url());
        shortcode_mediaCommand.setCreatedAt(source.getTaken_at_timestamp());
        shortcode_mediaCommand.setViewerHasLiked(source.getViewer_has_liked());
        shortcode_mediaCommand.setViewerHasSaved(source.getViewer_has_saved());

        if (source.getEdge_media_to_caption() != null && !source.getEdge_media_to_caption().getEdges().isEmpty()) {
            final String description = source.getEdge_media_to_caption().getEdges().stream().findFirst().get().getNode().getText();
            shortcode_mediaCommand.setDescription(description);
        }

        if (source.getOwner() != null) {
            OwnerToOwnerCommand converter = new OwnerToOwnerCommand();
            final OwnerCommand ownerCommand = converter.convert(source.getOwner());
            shortcode_mediaCommand.setOwner(ownerCommand);
        }

        if (source.getLocation() != null) {
            LocationToLocationCommand converter = new LocationToLocationCommand();
            final LocationCommand locationCommand = converter.convert(source.getLocation());
            shortcode_mediaCommand.setLocation(locationCommand);
        }

        if (source.getEdge_media_preview_like() != null) {
            Edge_media_preview_likeToEdge_media_preview_likeCommand converter = new Edge_media_preview_likeToEdge_media_preview_likeCommand();
            final Edge_media_preview_likeCommand edge_media_preview_likeCommand = converter.convert(source.getEdge_media_preview_like());
            shortcode_mediaCommand.setLikes(edge_media_preview_likeCommand);
        }

        if (source.getDisplay_resources() != null) {
            shortcode_mediaCommand.setResourceArray(new ArrayList<>());
            Display_resourceToDisplay_resourceCommand converter = new Display_resourceToDisplay_resourceCommand();
            for (Display_resource display_resource : source.getDisplay_resources()) {
                final Display_resourceCommand display_resourceCommand = converter.convert(display_resource);
                shortcode_mediaCommand.getResourceArray().add(display_resourceCommand);
            }
        }

        if (source.getEdge_media_to_parent_comment() != null) {
            Edge_media_preview_commentToEdge_media_preview_commentCommand converter  = new Edge_media_preview_commentToEdge_media_preview_commentCommand();
            final Edge_media_preview_commentCommand edge_media_preview_commentCommand = converter.convert(source.getEdge_media_to_parent_comment());
            shortcode_mediaCommand.setCommentsData(edge_media_preview_commentCommand);
        }

        if (source.getEdge_sidecar_to_children() != null && source.getEdge_sidecar_to_children().getEdges() != null) {
            shortcode_mediaCommand.setSidecarArray(new ArrayList<>());
            Node__PostToNode__SidecarCommand converter = new Node__PostToNode__SidecarCommand();
            for (Edge__Post edge__post : source.getEdge_sidecar_to_children().getEdges()) {
                final Node__SidecarCommand node__sidecarCommand = converter.convert(edge__post.getNode());
                shortcode_mediaCommand.getSidecarArray().add(node__sidecarCommand);
            }
        }

        return shortcode_mediaCommand;
    }
}
