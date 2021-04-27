package com.converters;

import com.api.domain.Thumbnail_resource;
import com.commands.Thumbnail_resourceCommand;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import static constants.MyConstants.URL_PREFIX;

@Component
public class Thumbnail_resourceToThumbnail_resourceCommand implements Converter<Thumbnail_resource, Thumbnail_resourceCommand> {

    @Override
    public Thumbnail_resourceCommand convert(Thumbnail_resource source) {
        if (source == null) {
            return null;
        }
        final Thumbnail_resourceCommand thumbnail_resourceCommand = new Thumbnail_resourceCommand();
        thumbnail_resourceCommand.setSrc(URL_PREFIX + source.getSrc());
        thumbnail_resourceCommand.setConfig_height(source.getConfig_height());
        thumbnail_resourceCommand.setConfig_width(source.getConfig_width());
        return thumbnail_resourceCommand;
    }
}

