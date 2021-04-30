package com.api.mapper;

import com.domain.ThumbnailResource;
import com.api.model.ThumbnailResourceDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ThumbnailResourceMapper implements Converter<ThumbnailResource, ThumbnailResourceDTO> {

    @Override
    public ThumbnailResourceDTO convert(ThumbnailResource source) {
        if (source == null) {
            return null;
        }
        final ThumbnailResourceDTO thumbnailResourceDTO = new ThumbnailResourceDTO();
        thumbnailResourceDTO.setSrc(source.getSrc());
        thumbnailResourceDTO.setConfig_height(source.getConfig_height());
        thumbnailResourceDTO.setConfig_width(source.getConfig_width());
        return thumbnailResourceDTO;
    }
}

