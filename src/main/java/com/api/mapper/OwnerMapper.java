package com.api.mapper;

import com.domain.Owner;
import com.api.model.OwnerDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class OwnerMapper implements Converter<Owner, OwnerDTO> {

    @Override
    public OwnerDTO convert(Owner source) {
        if (source == null) {
            return null;
        }

        final OwnerDTO ownerDTO = new OwnerDTO();
        ownerDTO.setId(source.getId());
        ownerDTO.setUsername(source.getUsername());
        ownerDTO.setIsVerified(source.getIs_verified());
        ownerDTO.setUserImageUrl(source.getProfile_pic_url());
        return ownerDTO;
    }
}
