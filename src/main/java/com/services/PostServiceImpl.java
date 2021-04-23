package com.services;

import com.api.domain.GraphqlData;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class PostServiceImpl implements PostService {

    private RestTemplate restTemplate;

    private final String api_url;

    public PostServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }

    @Override
    public GraphqlData getPost(String shortcode) {
        UriComponents uriComponents = UriComponentsBuilder
                .fromUriString(api_url)
                .path("/p/{shortcode}")
                .buildAndExpand(shortcode);

        String responseEntity = restTemplate.getForObject(uriComponents.toUriString(), String.class);

        Pattern pattern = Pattern.compile("<script type=\"text/javascript\">window.__additionalDataLoaded\\('/p/"+ shortcode +"/',(.*)\\);</script>", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(responseEntity);
        while (matcher.find()) {
            responseEntity = matcher.group(1);
        }

        GraphqlData graphqlData;
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            graphqlData = mapper.readValue(responseEntity, GraphqlData.class);
        } catch (Exception e) {
            return null;
        }

        return graphqlData;
    }
}
