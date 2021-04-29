package com.converters;

import com.api.domain.EdgeList;
import com.api.domain.Edge;
import com.api.domain.Node_comment;
import com.commands.Edge_media_preview_commentCommand;
import com.commands.Node_CommentCommand;
import com.commands.Page_infoCommand;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Edge_media_preview_commentToEdge_media_preview_commentCommand implements Converter<EdgeList<Edge<Node_comment>>, Edge_media_preview_commentCommand> {

    @Override
    public Edge_media_preview_commentCommand convert(EdgeList<Edge<Node_comment>> source) {
        if (source == null) {
            return null;
        }

        final Edge_media_preview_commentCommand edge_media_preview_commentCommand = new Edge_media_preview_commentCommand();
        edge_media_preview_commentCommand.setCount(source.getCount());

        if (source.getPage_info() != null) {
            Page_infoToPage_infoCommand converter = new Page_infoToPage_infoCommand();
            final Page_infoCommand page_infoCommand = converter.convert(source.getPage_info());
            edge_media_preview_commentCommand.setPageInfo(page_infoCommand);
        }

        if (source.getEdges() != null && !source.getEdges().isEmpty()) {
            edge_media_preview_commentCommand.setCommentsArray(new ArrayList<>());
            Node_CommentToNode_CommentCommand converter = new Node_CommentToNode_CommentCommand();
            for (Edge<Node_comment> edge__comment : source.getEdges()) {
                final Node_CommentCommand node_commentCommand = converter.convert(edge__comment.getNode());
                edge_media_preview_commentCommand.getCommentsArray().add(node_commentCommand);
            }
        }
        return edge_media_preview_commentCommand;
    }
}
