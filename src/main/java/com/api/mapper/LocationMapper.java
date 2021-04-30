package com.api.mapper;

import com.domain.Location;
import com.api.model.EdgeListPostDTO;
import com.api.model.LocationDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LocationMapper implements Converter<Location, LocationDTO> {

    @Override
    public LocationDTO convert(Location source) {
        if (source == null) {
            return null;
        }

        final LocationDTO locationDTO = new LocationDTO();
        locationDTO.setId(source.getId());
        locationDTO.setName(source.getName());
        locationDTO.setSlug(source.getSlug());
        locationDTO.setLocationName(source.getName());
        locationDTO.setLat(source.getLat());
        locationDTO.setLng(source.getLng());
        locationDTO.setAddressJson(source.getAddress_json());
        locationDTO.setLocationImageUrl(source.getProfile_pic_url());
        
        if (source.getEdge_location_to_media() != null) {
            locationDTO.setPostCount(source.getEdge_location_to_media().getCount());
        }

        if (source.getEdge_location_to_top_posts() != null && !source.getEdge_location_to_top_posts().getEdges().isEmpty()) {
            EdgeListPostMapper converter = new EdgeListPostMapper();
            EdgeListPostDTO edgeListPostDTO = converter.convert(source.getEdge_location_to_top_posts());

            locationDTO.setTopMedia(edgeListPostDTO);
        }

        if (source.getEdge_location_to_media() != null && !source.getEdge_location_to_media().getEdges().isEmpty()) {
            EdgeListPostMapper converter = new EdgeListPostMapper();
            EdgeListPostDTO edgeListPostDTO = converter.convert(source.getEdge_location_to_media());

            locationDTO.setTimelineMedia(edgeListPostDTO);
        }
        
        return locationDTO;
    }
}
