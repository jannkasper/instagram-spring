package com.converters;

import com.api.domain.Location;
import com.commands.Edge_owner_to_timeline_mediaCommand;
import com.commands.LocationCommand;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LocationToLocationCommand implements Converter<Location, LocationCommand> {

    @Override
    public LocationCommand convert(Location source) {
        if (source == null) {
            return null;
        }

        final LocationCommand locationCommand = new LocationCommand();
        locationCommand.setId(source.getId());
        locationCommand.setName(source.getName());
        locationCommand.setSlug(source.getSlug());
        locationCommand.setLocationName(source.getName());
        locationCommand.setLat(source.getLat());
        locationCommand.setLng(source.getLng());
        locationCommand.setAddressJson(source.getAddress_json());
        locationCommand.setLocationImageUrl(source.getProfile_pic_url());
        
        if (source.getEdge_location_to_media() != null) {
            locationCommand.setPostCount(source.getEdge_location_to_media().getCount());
        }

        if (source.getEdge_location_to_top_posts() != null && !source.getEdge_location_to_top_posts().getEdges().isEmpty()) {
            Edge_owner_to_timeline_mediaToEdge_owner_to_timeline_mediaCommand converter = new Edge_owner_to_timeline_mediaToEdge_owner_to_timeline_mediaCommand();
            Edge_owner_to_timeline_mediaCommand edge_owner_to_timeline_mediaCommand = converter.convert(source.getEdge_location_to_top_posts());

            locationCommand.setTopMedia(edge_owner_to_timeline_mediaCommand);
        }

        if (source.getEdge_location_to_media() != null && !source.getEdge_location_to_media().getEdges().isEmpty()) {
            Edge_owner_to_timeline_mediaToEdge_owner_to_timeline_mediaCommand converter = new Edge_owner_to_timeline_mediaToEdge_owner_to_timeline_mediaCommand();
            Edge_owner_to_timeline_mediaCommand edge_owner_to_timeline_mediaCommand = converter.convert(source.getEdge_location_to_media());

            locationCommand.setTimelineMedia(edge_owner_to_timeline_mediaCommand);
        }
        
        return locationCommand;
    }
}
