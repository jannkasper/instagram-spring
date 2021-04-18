package com.services;

import com.api.domain.profile.Profile;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
    public Profile getPosts() {
        String responseEntity = restTemplate.getForObject(api_url, String.class);

        Pattern pattern = Pattern.compile("<script type=\"text/javascript\">window.__additionalDataLoaded\\('feed',(.*)\\);</script>", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(responseEntity);
        while (matcher.find()) {
            responseEntity = matcher.group(1);
        }

        Profile profile;
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            profile =  mapper.readValue(responseEntity, Profile.class);
        } catch (Exception e) {
            return null;
        }

        return profile;
    }
}
