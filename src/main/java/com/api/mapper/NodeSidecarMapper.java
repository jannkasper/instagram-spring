package com.api.mapper;

import com.api.model.DisplayResourceDTO;
import com.api.model.NodeSidecarDTO;
import com.domain.DisplayResource;
import com.domain.NodePost;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class NodeSidecarMapper implements Converter<NodePost, NodeSidecarDTO> {

    @Override
    public NodeSidecarDTO convert(NodePost source) {
        if (source == null) {
            return null;
        }

        final NodeSidecarDTO node__sidecarDTO = new NodeSidecarDTO();
        node__sidecarDTO.setId(source.getId());
        node__sidecarDTO.setShortcode(source.getShortcode());
        node__sidecarDTO.setIsVideo(source.getIs_video());

        if (source.getDisplay_resources() != null) {
            node__sidecarDTO.setResourceArray(new ArrayList<>());
            DisplayResourceMapper converter = new DisplayResourceMapper();
            for (DisplayResource display_resource : source.getDisplay_resources()) {
                final DisplayResourceDTO displayResourceDTO = converter.convert(display_resource);
                node__sidecarDTO.getResourceArray().add(displayResourceDTO);
            }
        }

        return node__sidecarDTO;
    }
}
