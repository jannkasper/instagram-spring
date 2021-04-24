package com.services;

import com.api.domain.FeedData;
import com.api.domain.GraphqlData;
import com.commands.Edge_owner_to_timeline_mediaCommand;
import com.commands.Shortcode_mediaCommand;
import com.converters.Edge_owner_to_timeline_mediaToEdge_owner_to_timeline_mediaCommand;
import com.converters.Shortcode_mediaToShortcode_mediaCommand;
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

    @Override
    public Shortcode_mediaCommand getPostCommand(String shortcode) {
        GraphqlData graphqlData = getPost(shortcode);

        if (graphqlData == null) {
            return null;
        }

        Shortcode_mediaToShortcode_mediaCommand converter = new Shortcode_mediaToShortcode_mediaCommand();
        Shortcode_mediaCommand shortcode_mediaCommand = converter.convert(graphqlData.getGraphql().getShortcode_media());
        return shortcode_mediaCommand;
    }

    @Override
    public FeedData getPostFeed(String shortcode, String userId, String first) {
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

        FeedData feedData = restTemplate.getForObject(uriComponents.toUri(), FeedData.class);

        return feedData;
    }

    @Override
    public Edge_owner_to_timeline_mediaCommand getEdge_owner_to_timeline_mediaCommand(String shortcode, String userId, String first) {
        FeedData feedData = getPostFeed(shortcode, userId, first);

        if (feedData == null) {
            return null;
        }

        Edge_owner_to_timeline_mediaToEdge_owner_to_timeline_mediaCommand converter = new Edge_owner_to_timeline_mediaToEdge_owner_to_timeline_mediaCommand();
        Edge_owner_to_timeline_mediaCommand edge_owner_to_timeline_mediaCommand = converter.convert(feedData.getData().getUser().getEdge_owner_to_timeline_media());
        edge_owner_to_timeline_mediaCommand.setMediaArray(edge_owner_to_timeline_mediaCommand.getMediaArray()
                .stream()
                .filter(item -> !shortcode.equals(item.getShortcode()))
                .limit(6)
                .collect(Collectors.toList()));
        return edge_owner_to_timeline_mediaCommand;
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
