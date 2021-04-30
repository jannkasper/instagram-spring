package com.services;

import com.domain.GraphqlContainer;
import com.api.model.HashtagDTO;
import com.api.mapper.HashtagMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class HashtagServiceImpl implements HashtagService {

    private RestTemplate restTemplate;

    private final String api_url;

    public HashtagServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }

    @Override
    public GraphqlContainer getHashtag(String name) {

        UriComponents uriComponents = UriComponentsBuilder
                .fromUriString(api_url)
                .path("/explore/tags/{name}/?__a=1")
                .buildAndExpand(name);

        GraphqlContainer responseEntity = restTemplate.getForObject(uriComponents.toUriString(), GraphqlContainer.class);

        return responseEntity;
    }

    @Override
    public HashtagDTO getHashtagDTO(String name) {
        GraphqlContainer graphqlContainer = getHashtag(name);

        if (graphqlContainer == null || graphqlContainer.getGraphql().getHashtag() == null) {
            return null;
        }

        HashtagMapper mapper = new HashtagMapper();
        HashtagDTO hashtagDTO = mapper.convert(graphqlContainer.getGraphql().getHashtag());
        return hashtagDTO;
    }
}
