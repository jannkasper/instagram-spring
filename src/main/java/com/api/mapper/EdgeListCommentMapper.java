package com.api.mapper;

import com.domain.EdgeList;
import com.domain.Edge;
import com.domain.NodeComment;
import com.api.model.EdgeListCommentDTO;
import com.api.model.NodeCommentDTO;
import com.api.model.PageInfoDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class EdgeListCommentMapper implements Converter<EdgeList<Edge<NodeComment>>, EdgeListCommentDTO> {

    @Override
    public EdgeListCommentDTO convert(EdgeList<Edge<NodeComment>> source) {
        if (source == null) {
            return null;
        }

        final EdgeListCommentDTO edgeListCommentDTO = new EdgeListCommentDTO();
        edgeListCommentDTO.setCount(source.getCount());

        if (source.getPage_info() != null) {
            PageInfoMapper converter = new PageInfoMapper();
            final PageInfoDTO pageInfoDTO = converter.convert(source.getPage_info());
            edgeListCommentDTO.setPageInfo(pageInfoDTO);
        }

        if (source.getEdges() != null && !source.getEdges().isEmpty()) {
            edgeListCommentDTO.setCommentsArray(new ArrayList<>());
            NodeCommentMapper converter = new NodeCommentMapper();
            for (Edge<NodeComment> edgeComment : source.getEdges()) {
                final NodeCommentDTO nodeCommentDTO = converter.convert(edgeComment.getNode());
                edgeListCommentDTO.getCommentsArray().add(nodeCommentDTO);
            }
        }
        return edgeListCommentDTO;
    }
}
