package com.services;

import com.domain.UserContainer;
import com.domain.EntryDataContainer;
import com.api.model.UserDTO;
import com.api.mapper.UserMapper;
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
public class UserServiceImpl implements UserService {

    private RestTemplate restTemplate;

    private final String api_url;

    public UserServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }

    @Override
    public UserContainer getUserFeed() {
        String responseEntity = restTemplate.getForObject(api_url, String.class);

        Pattern pattern = Pattern.compile("<script type=\"text/javascript\">window.__additionalDataLoaded\\('feed',(.*)\\);</script>", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(responseEntity);
        while (matcher.find()) {
            responseEntity = matcher.group(1);
        }

        UserContainer userContainer;
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            userContainer =  mapper.readValue(responseEntity, UserContainer.class);
        } catch (Exception e) {
            return null;
        }

        return userContainer;
    }

    @Override
    public UserDTO getUserFeedDTO() {
        UserContainer userContainer = getUserFeed();

        if (userContainer == null) {
            return null;
        }

        UserMapper mapper = new UserMapper();
        UserDTO userDTO = mapper.convert(userContainer.getUser());
        return userDTO;
    }

    @Override
    public EntryDataContainer getUser(String username) {
        UriComponents uriComponents = UriComponentsBuilder
                .fromUriString(api_url)
                .path("/{username}")
                .buildAndExpand(username);

        String responseEntity = restTemplate.getForObject(uriComponents.toUriString(), String.class);

        Pattern pattern = Pattern.compile("<script type=\"text/javascript\">window\\._sharedData = (.*);</script>\n<script type=\"text/javascript\">window.__initialDataLoaded\\(window._sharedData\\);</script>", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(responseEntity);
        while (matcher.find()) {
            responseEntity = matcher.group(1);
        }

        EntryDataContainer entryDataContainer;
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            entryDataContainer =  mapper.readValue(responseEntity, EntryDataContainer.class);
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }

        return entryDataContainer;
    }

    @Override
    public UserDTO getUserDTO(String username) {
        EntryDataContainer entryDataContainer = getUser(username);

        if (entryDataContainer == null || entryDataContainer.getEntry_data().getProfilePage() == null) {
            return null;
        }

        UserMapper mapper = new UserMapper();
        UserDTO userDTO = mapper.convert(entryDataContainer.getEntry_data().getProfilePage().stream().findFirst().get().getGraphql().getUser());
        return userDTO;
    }
}
