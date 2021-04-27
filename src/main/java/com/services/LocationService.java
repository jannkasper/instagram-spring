package com.services;

import com.api.domain.GraphqlData;
import com.commands.LocationCommand;

public interface LocationService {

    GraphqlData getLocation(String locationId, String locationName);

    LocationCommand getLocationCommand(String locationId, String locationName);
}
