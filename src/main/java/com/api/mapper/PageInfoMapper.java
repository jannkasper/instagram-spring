package com.api.mapper;

import com.domain.PageInfo;
import com.api.model.PageInfoDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PageInfoMapper implements Converter<PageInfo, PageInfoDTO> {

    @Override
    public PageInfoDTO convert(PageInfo source) {
        if (source == null) {
            return null;
        }

        final PageInfoDTO pageInfoDTO = new PageInfoDTO();
        pageInfoDTO.setHasNextPage(source.getHas_next_page());
        pageInfoDTO.setEndCursor(source.getEnd_cursor());
        return pageInfoDTO;
    }
}
