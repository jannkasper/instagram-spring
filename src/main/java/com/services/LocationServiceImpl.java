package com.services;

import com.domain.GraphqlContainer;
import com.api.model.LocationDTO;
import com.api.mapper.LocationMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class LocationServiceImpl implements LocationService {

    private RestTemplate restTemplate;

    private final String api_url;

    public LocationServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }

    @Override
    public GraphqlContainer getLocation(String locationId, String locationName) {

        UriComponents uriComponents = UriComponentsBuilder
                .fromUriString(api_url)
                .path("/explore/locations/{locationId}/{locationName}/?__a=1")
                .buildAndExpand(locationId, locationName);

        GraphqlContainer responseEntity = restTemplate.getForObject(uriComponents.toUriString(), GraphqlContainer.class);

        return responseEntity;
    }

    @Override
    public LocationDTO getLocationDTO(String locationId, String locationName) {
        GraphqlContainer graphqlContainer = getLocation(locationId, locationName);

        if (graphqlContainer == null || graphqlContainer.getGraphql().getLocation() == null) {
            return null;
        }

        LocationMapper mapper = new LocationMapper();
        LocationDTO locationDTO = mapper.convert(graphqlContainer.getGraphql().getLocation());
        return locationDTO;
    }
}
