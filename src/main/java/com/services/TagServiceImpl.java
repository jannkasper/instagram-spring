package com.services;

import com.api.domain.Tag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class TagServiceImpl implements TagService {

    private RestTemplate restTemplate;

    private final String api_url;

    public TagServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }

    @Override
    public Tag getTag(String name) {

        UriComponents uriComponents = UriComponentsBuilder
                .fromUriString(api_url)
                .path("/explore/tags/{name}/?__a=1")
                .buildAndExpand(name);

        Tag responseEntity = restTemplate.getForObject(uriComponents.toUriString(), Tag.class);

        return responseEntity;
    }
}
