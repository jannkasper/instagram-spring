package com.converters;

import com.api.domain.Node__Comment;
import com.commands.Node_CommentCommand;
import com.commands.OwnerCommand;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class Node_CommentToNode_CommentCommand implements Converter<Node__Comment, Node_CommentCommand> {

    @Override
    public Node_CommentCommand convert(Node__Comment source) {
        if (source == null) {
            return null;
        }

        final Node_CommentCommand node_commentCommand = new Node_CommentCommand();
        node_commentCommand.setId(source.getId());
        node_commentCommand.setCreatedAt(source.getCreated_at());
        node_commentCommand.setText(source.getText());
        node_commentCommand.setViewerHasLiked(source.getViewer_has_liked());

        if (source.getEdge_liked_by() != null) {
            node_commentCommand.setLikes(source.getEdge_liked_by().getCount());
        }

        if (source.getOwner() != null) {
            OwnerToOwnerCommand converter = new OwnerToOwnerCommand();
            final OwnerCommand ownerCommand = converter.convert(source.getOwner());
            node_commentCommand.setOwner(ownerCommand);

        }
        return node_commentCommand;
    }
}
