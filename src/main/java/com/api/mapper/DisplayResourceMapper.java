package com.api.mapper;

import com.domain.DisplayResource;
import com.api.model.DisplayResourceDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DisplayResourceMapper implements Converter<DisplayResource, DisplayResourceDTO> {

    @Override
    public DisplayResourceDTO convert(DisplayResource source) {
        if (source == null) {
            return null;
        }
        final DisplayResourceDTO displayResourceDTO = new DisplayResourceDTO();
        displayResourceDTO.setSrc(source.getSrc());
        displayResourceDTO.setConfig_height(source.getConfig_height());
        displayResourceDTO.setConfig_width(source.getConfig_width());
        return displayResourceDTO;
    }
}
