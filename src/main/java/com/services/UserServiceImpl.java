package com.services;

import com.api.domain.UserData;
import com.api.domain.EntryData;
import com.commands.UserCommand;
import com.converters.UserToUserCommand;
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
    public UserData getUserMedia() {
        String responseEntity = restTemplate.getForObject(api_url, String.class);

        Pattern pattern = Pattern.compile("<script type=\"text/javascript\">window.__additionalDataLoaded\\('feed',(.*)\\);</script>", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(responseEntity);
        while (matcher.find()) {
            responseEntity = matcher.group(1);
        }

        UserData userData;
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            userData =  mapper.readValue(responseEntity, UserData.class);
        } catch (Exception e) {
            return null;
        }

        return userData;
    }

    @Override
    public UserCommand getUserMediaCommand() {
        UserData userData = getUserMedia();

        if (userData == null) {
            return null;
        }

        UserToUserCommand converter = new UserToUserCommand();
        UserCommand userCommand = converter.convert(userData.getUser());
        return userCommand;
    }

    @Override
    public EntryData getUser(String username) {
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

        EntryData entryData;
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            entryData =  mapper.readValue(responseEntity, EntryData.class);
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }

        return entryData;
    }

    @Override
    public UserCommand getUserCommand(String username) {
        EntryData entryData = getUser(username);

        if (entryData == null || entryData.getEntry_data().getProfilePage() == null) {
            return null;
        }

        UserToUserCommand converter = new UserToUserCommand();
        UserCommand userCommand = converter.convert(entryData.getEntry_data().getProfilePage().stream().findFirst().get().getGraphql().getUser());
        return userCommand;
    }
}
