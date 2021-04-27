package com.converters;

import com.api.domain.Owner;
import com.commands.OwnerCommand;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import static constants.MyConstants.URL_PREFIX;

@Component
public class OwnerToOwnerCommand implements Converter<Owner, OwnerCommand> {

    @Override
    public OwnerCommand convert(Owner source) {
        if (source == null) {
            return null;
        }

        final OwnerCommand ownerCommand = new OwnerCommand();
        ownerCommand.setId(source.getId());
        ownerCommand.setUsername(source.getUsername());
        ownerCommand.setIsVerified(source.getIs_verified());
        ownerCommand.setUserImageUrl(URL_PREFIX + source.getProfile_pic_url());
        return ownerCommand;
    }
}
