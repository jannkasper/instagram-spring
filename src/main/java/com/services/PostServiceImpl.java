package com.services;

import com.domain.DataContainer;
import com.domain.GraphqlContainer;
import com.api.model.EdgeListPostDTO;
import com.api.model.ShortcodeMediaDTO;
import com.api.mapper.EdgeListPostMapper;
import com.api.mapper.ShortcodeMediaMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    public static String FEED_PATH = "003056d32c2554def87228bc3fd9668a";

    private RestTemplate restTemplate;

    private final String api_url;

    public PostServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }

    @Override
    public GraphqlContainer getPost(String shortcode) {
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

        GraphqlContainer graphqlContainer;
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            graphqlContainer = mapper.readValue(responseEntity, GraphqlContainer.class);
        } catch (Exception e) {
            return null;
        }

        return graphqlContainer;
    }

    @Override
    public ShortcodeMediaDTO getPostDTO(String shortcode) {
        GraphqlContainer graphqlContainer = getPost(shortcode);

        if (graphqlContainer == null) {
            return null;
        }

        ShortcodeMediaMapper mapper = new ShortcodeMediaMapper();
        ShortcodeMediaDTO shortcodeMediaDTO = mapper.convert(graphqlContainer.getGraphql().getShortcode_media());
        return shortcodeMediaDTO;
    }

    @Override
    public DataContainer getPostFeed(String shortcode, String userId, String first) {
        Map map = new HashMap();
        map.put("id", userId);
        map.put("first", first);

        String convertedParams = convertPathParams(map);
        UriComponents uriComponents = UriComponentsBuilder
                .fromUriString(api_url)
                .path("/graphql/query/")
                .queryParam("query_hash", FEED_PATH)
                .queryParam("variables", convertedParams)
                .build();

        DataContainer dataContainer = restTemplate.getForObject(uriComponents.toUri(), DataContainer.class);

        return dataContainer;
    }

    @Override
    public EdgeListPostDTO getPostFeedDTO(String shortcode, String userId, String first) {
        DataContainer dataContainer = getPostFeed(shortcode, userId, first);

        if (dataContainer == null) {
            return null;
        }

        EdgeListPostMapper mapper = new EdgeListPostMapper();
        EdgeListPostDTO edgeListPostDTO = mapper.convert(dataContainer.getData().getUser().getEdge_owner_to_timeline_media());
        edgeListPostDTO.setMediaArray(edgeListPostDTO.getMediaArray()
                .stream()
                .filter(item -> !shortcode.equals(item.getShortcode()))
                .limit(6)
                .collect(Collectors.toList()));
        return edgeListPostDTO;
    }

    public String convertPathParams(Map map) {
        ArrayList<String> paramArray = new ArrayList();
        for(Object key : map.keySet()) {
            if (map.get(key) != null) {
                paramArray.add("\"" + key.toString() + "\":\"" + map.get(key).toString() + "\"");
            }
        }
        String result = "{" + paramArray.stream().collect( Collectors.joining( "," ) ) + "}";
        return result;
    }

}
