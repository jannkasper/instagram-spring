package com.api.mapper;

import com.domain.NodeComment;
import com.api.model.NodeCommentDTO;
import com.api.model.OwnerDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class NodeCommentMapper implements Converter<NodeComment, NodeCommentDTO> {

    @Override
    public NodeCommentDTO convert(NodeComment source) {
        if (source == null) {
            return null;
        }

        final NodeCommentDTO node_commentDTO = new NodeCommentDTO();
        node_commentDTO.setId(source.getId());
        node_commentDTO.setCreatedAt(source.getCreated_at());
        node_commentDTO.setText(source.getText());
        node_commentDTO.setViewerHasLiked(source.getViewer_has_liked());

        if (source.getEdge_liked_by() != null) {
            node_commentDTO.setLikes(source.getEdge_liked_by().getCount());
        }

        if (source.getOwner() != null) {
            OwnerMapper converter = new OwnerMapper();
            final OwnerDTO ownerDTO = converter.convert(source.getOwner());
            node_commentDTO.setOwner(ownerDTO);

        }
        return node_commentDTO;
    }
}
