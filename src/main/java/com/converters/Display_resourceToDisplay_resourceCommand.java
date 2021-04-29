package com.converters;

import com.api.domain.Display_resource;
import com.commands.Display_resourceCommand;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class Display_resourceToDisplay_resourceCommand implements Converter<Display_resource, Display_resourceCommand> {

    @Override
    public Display_resourceCommand convert(Display_resource source) {
        if (source == null) {
            return null;
        }
        final Display_resourceCommand display_resourceCommand = new Display_resourceCommand();
        display_resourceCommand.setSrc(source.getSrc());
        display_resourceCommand.setConfig_height(source.getConfig_height());
        display_resourceCommand.setConfig_width(source.getConfig_width());
        return display_resourceCommand;
    }
}
