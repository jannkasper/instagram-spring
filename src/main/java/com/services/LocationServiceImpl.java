package com.services;

import com.api.domain.GraphqlData;
import com.commands.LocationCommand;
import com.converters.LocationToLocationCommand;
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
    public GraphqlData getLocation(String locationId, String locationName) {

        UriComponents uriComponents = UriComponentsBuilder
                .fromUriString(api_url)
                .path("/explore/locations/{locationId}/{locationName}/?__a=1")
                .buildAndExpand(locationId, locationName);

        GraphqlData responseEntity = restTemplate.getForObject(uriComponents.toUriString(), GraphqlData.class);

        return responseEntity;
    }

    @Override
    public LocationCommand getLocationCommand(String locationId, String locationName) {
        GraphqlData graphqlData = getLocation(locationId, locationName);

        if (graphqlData == null || graphqlData.getGraphql().getHashtag() == null) {
            return null;
        }

        LocationToLocationCommand converter = new LocationToLocationCommand();
        LocationCommand locationCommand = converter.convert(graphqlData.getGraphql().getLocation());
        return null;
    }
}
