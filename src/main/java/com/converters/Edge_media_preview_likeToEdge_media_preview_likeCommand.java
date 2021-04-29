package com.converters;

import com.api.domain.Edge;
import com.commands.Edge_media_preview_likeCommand;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class Edge_media_preview_likeToEdge_media_preview_likeCommand implements Converter<Edge<Object>, Edge_media_preview_likeCommand> {

    @Override
    public Edge_media_preview_likeCommand convert(Edge<Object> source) {
        if (source == null) {
            return null;
        }

        final Edge_media_preview_likeCommand edge_media_preview_likeCommand = new Edge_media_preview_likeCommand();
        edge_media_preview_likeCommand.setCount(source.getCount());
        return edge_media_preview_likeCommand;
    }
}
