package com.api.mapper;

import com.domain.EdgeList;
import com.domain.Edge;
import com.domain.NodePost;
import com.api.model.EdgeListPostDTO;
import com.api.model.NodePostDTO;
import com.api.model.PageInfoDTO;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;

public class EdgeListPostMapper implements Converter<EdgeList<Edge<NodePost>>, EdgeListPostDTO> {

    @Override
    public EdgeListPostDTO convert(EdgeList<Edge<NodePost>> source) {
        if (source == null) {
            return null;
        }

        final EdgeListPostDTO edgeListPostDTO = new EdgeListPostDTO();

        if (source.getPage_info() != null) {
            PageInfoMapper converter = new PageInfoMapper();
            final PageInfoDTO pageInfoDTO = converter.convert(source.getPage_info());
            edgeListPostDTO.setPageInfo(pageInfoDTO);
        }

        if (source.getEdges() != null && !source.getEdges().isEmpty()) {
            edgeListPostDTO.setMediaArray(new ArrayList<>());
            NodePostMapper converter = new NodePostMapper();
            for (Edge<NodePost> edgePost : source.getEdges()) {
                final NodePostDTO nodePostDTO = converter.convert(edgePost.getNode());
                edgeListPostDTO.getMediaArray().add(nodePostDTO);
            }
        }

        return edgeListPostDTO;
    }
}