package com.converters;

import com.api.domain.Location;
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
        return locationCommand;
    }
}
