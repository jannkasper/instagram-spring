package com.converters;

import com.api.domain.Edge__Post;
import com.api.domain.Edge_owner_to_timeline_media;
import com.api.domain.Node__Post;
import com.commands.Edge_owner_to_timeline_mediaCommand;
import com.commands.Node__PostCommand;
import com.commands.Page_infoCommand;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;

public class Edge_owner_to_timeline_mediaToEdge_owner_to_timeline_mediaCommand implements Converter<Edge_owner_to_timeline_media, Edge_owner_to_timeline_mediaCommand> {

    @Override
    public Edge_owner_to_timeline_mediaCommand convert(Edge_owner_to_timeline_media source) {
        if (source == null) {
            return null;
        }

        final Edge_owner_to_timeline_mediaCommand edge_owner_to_timeline_mediaCommand = new Edge_owner_to_timeline_mediaCommand();

        if (source.getPage_info() != null) {
            Page_infoToPage_infoCommand converter = new Page_infoToPage_infoCommand();
            final Page_infoCommand page_infoCommand = converter.convert(source.getPage_info());
            edge_owner_to_timeline_mediaCommand.setPageInfo(page_infoCommand);
        }

        if (source.getEdges() != null && !source.getEdges().isEmpty()) {
            edge_owner_to_timeline_mediaCommand.setMediaArray(new ArrayList<>());
            Node__PostToNode__PostCommand converter = new Node__PostToNode__PostCommand();
            for (Edge__Post edge__post : source.getEdges()) {
                final Node__PostCommand node__postCommand = converter.convert(edge__post.getNode());
                edge_owner_to_timeline_mediaCommand.getMediaArray().add(node__postCommand);
            }
        }

        return edge_owner_to_timeline_mediaCommand;
    }
}