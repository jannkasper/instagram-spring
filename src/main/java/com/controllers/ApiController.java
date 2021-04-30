package com.controllers;

import com.api.model.*;
import com.domain.EntryDataContainer;
import com.domain.DataContainer;
import com.domain.GraphqlContainer;
import com.domain.UserContainer;
import com.services.LocationService;
import com.services.PostService;
import com.services.HashtagService;
import com.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin(maxAge = 3600)
@RequestMapping(ApiController.BASE_URL)
@RestController
public class ApiController {
    public static final String BASE_URL = "/api";

    private UserService userService;
    private PostService postService;
    private HashtagService tagService;
    private LocationService locationService;

    public ApiController(UserService userService, PostService postService, HashtagService tagService, LocationService locationService) {
        this.userService = userService;
        this.postService = postService;
        this.tagService = tagService;
        this.locationService = locationService;
    }

    @GetMapping("/posts")
    @ResponseStatus(HttpStatus.OK)
    public UserContainer getUserFeed() {
        return userService.getUserFeed();
    }

    @GetMapping("/v2/posts")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO getUserFeedCommand() {
        return userService.getUserFeedDTO();
    }

    @GetMapping("/posts/{shortcode}")
    @ResponseStatus(HttpStatus.OK)
    public GraphqlContainer getPost(@PathVariable String shortcode) {
        return postService.getPost(shortcode);
    }

    @GetMapping("/v2/posts/{shortcode}")
    @ResponseStatus(HttpStatus.OK)
    public ShortcodeMediaDTO getPostCommand(@PathVariable String shortcode) {
        return postService.getPostDTO(shortcode);
    }

    @GetMapping("/posts/{shortcode}/more")
    @ResponseStatus(HttpStatus.OK)
    public DataContainer getPostFeed(@PathVariable String shortcode, @RequestParam String userId, @RequestParam String first) {
        return postService.getPostFeed(shortcode, userId, first);
    }

    @GetMapping("/v2/posts/{shortcode}/more")
    @ResponseStatus(HttpStatus.OK)
    public EdgeListPostDTO getEdge_owner_to_timeline_mediaCommand(@PathVariable String shortcode, @RequestParam String userId, @RequestParam String first) {
        return postService.getPostFeedDTO(shortcode, userId, first);
    }

    @GetMapping("/users/{username}")
    @ResponseStatus(HttpStatus.OK)
    public EntryDataContainer getEntryData(@PathVariable String username) {
        return userService.getUser(username);
    }

    @GetMapping("/v2/users/{username}")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO getUserCommand(@PathVariable String username) {
        return userService.getUserDTO(username);
    }

    @GetMapping("tags/{tagName}")
    @ResponseStatus(HttpStatus.OK)
    public GraphqlContainer getTag(@PathVariable String tagName) {
        return tagService.getHashtag(tagName);
    }

    @GetMapping("/v2/tags/{tagName}")
    @ResponseStatus(HttpStatus.OK)
    public HashtagDTO getTagCommand(@PathVariable String tagName) {
        return tagService.getHashtagDTO(tagName);
    }

    @GetMapping("/locations/{locationId}/{locationName}")
    @ResponseStatus(HttpStatus.OK)
    public GraphqlContainer getLocation(@PathVariable String locationId, @PathVariable String locationName) {
        return locationService.getLocation(locationId, locationName);
    }

    @GetMapping("/v2/locations/{locationId}/{locationName}")
    @ResponseStatus(HttpStatus.OK)
    public LocationDTO getLocationCommand(@PathVariable String locationId, @PathVariable String locationName) {
        return locationService.getLocationDTO(locationId, locationName);
    }
}
