package com.converters;

import com.api.domain.Display_resource;
import com.api.domain.Node_post;
import com.commands.*;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Node__PostToNode__SidecarCommand implements Converter<Node_post, Node__SidecarCommand> {

    @Override
    public Node__SidecarCommand convert(Node_post source) {
        if (source == null) {
            return null;
        }

        final Node__SidecarCommand node__sidecarCommand = new Node__SidecarCommand();
        node__sidecarCommand.setId(source.getId());
        node__sidecarCommand.setShortcode(source.getShortcode());
        node__sidecarCommand.setIsVideo(source.getIs_video());

        if (source.getDisplay_resources() != null) {
            node__sidecarCommand.setResourceArray(new ArrayList<>());
            Display_resourceToDisplay_resourceCommand converter = new Display_resourceToDisplay_resourceCommand();
            for (Display_resource display_resource : source.getDisplay_resources()) {
                final Display_resourceCommand display_resourceCommand = converter.convert(display_resource);
                node__sidecarCommand.getResourceArray().add(display_resourceCommand);
            }
        }

        return node__sidecarCommand;
    }
}
