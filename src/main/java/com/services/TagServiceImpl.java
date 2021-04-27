package com.services;

import com.api.domain.GraphqlData;
import com.commands.HashtagCommand;
import com.converters.HashtagToHashtagCommand;
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
    public GraphqlData getTag(String name) {

        UriComponents uriComponents = UriComponentsBuilder
                .fromUriString(api_url)
                .path("/explore/tags/{name}/?__a=1")
                .buildAndExpand(name);

        GraphqlData responseEntity = restTemplate.getForObject(uriComponents.toUriString(), GraphqlData.class);

        return responseEntity;
    }

    @Override
    public HashtagCommand getTagCommand(String name) {
        GraphqlData graphqlData = getTag(name);

        if (graphqlData == null || graphqlData.getGraphql().getHashtag() == null) {
            return null;
        }

        HashtagToHashtagCommand converter = new HashtagToHashtagCommand();
        HashtagCommand hashtagCommand = converter.convert(graphqlData.getGraphql().getHashtag());
        return hashtagCommand;
    }
}
