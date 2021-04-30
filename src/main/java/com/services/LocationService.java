package com.services;

import com.domain.GraphqlContainer;
import com.api.model.LocationDTO;

public interface LocationService {

    GraphqlContainer getLocation(String locationId, String locationName);

    LocationDTO getLocationDTO(String locationId, String locationName);
}
