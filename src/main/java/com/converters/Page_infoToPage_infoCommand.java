package com.converters;

import com.api.domain.Page_info;
import com.commands.Page_infoCommand;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class Page_infoToPage_infoCommand implements Converter<Page_info, Page_infoCommand> {

    @Override
    public Page_infoCommand convert(Page_info source) {
        if (source == null) {
            return null;
        }

        final Page_infoCommand page_infoCommand = new Page_infoCommand();
        page_infoCommand.setHasNextPage(source.getHas_next_page());
        page_infoCommand.setEndCursor(source.getEnd_cursor());
        return page_infoCommand;
    }
}
