package com.controllers;

import com.api.domain.*;
import com.commands.*;
import com.services.LocationService;
import com.services.PostService;
import com.services.TagService;
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
    private TagService tagService;
    private LocationService locationService;

    public ApiController(UserService userService, PostService postService, TagService tagService, LocationService locationService) {
        this.userService = userService;
        this.postService = postService;
        this.tagService = tagService;
        this.locationService = locationService;
    }

    @GetMapping("/posts")
    @ResponseStatus(HttpStatus.OK)
    public UserData getUserFeed() {
        return userService.getUserMedia();
    }

    @GetMapping("/v2/posts")
    @ResponseStatus(HttpStatus.OK)
    public UserCommand getUserFeedCommand() {
        return userService.getUserMediaCommand();
    }

    @GetMapping("/posts/{shortcode}")
    @ResponseStatus(HttpStatus.OK)
    public GraphqlData getPost(@PathVariable String shortcode) {
        return postService.getPost(shortcode);
    }

    @GetMapping("/v2/posts/{shortcode}")
    @ResponseStatus(HttpStatus.OK)
    public Shortcode_mediaCommand getPostCommand(@PathVariable String shortcode) {
        return postService.getPostCommand(shortcode);
    }

    @GetMapping("/posts/{shortcode}/more")
    @ResponseStatus(HttpStatus.OK)
    public FeedData getPostFeed(@PathVariable String shortcode, @RequestParam String userId, @RequestParam String first) {
        return postService.getPostFeed(shortcode, userId, first);
    }

    @GetMapping("/v2/posts/{shortcode}/more")
    @ResponseStatus(HttpStatus.OK)
    public Edge_owner_to_timeline_mediaCommand getEdge_owner_to_timeline_mediaCommand(@PathVariable String shortcode, @RequestParam String userId, @RequestParam String first) {
        return postService.getEdge_owner_to_timeline_mediaCommand(shortcode, userId, first);
    }

    @GetMapping("/users/{username}")
    @ResponseStatus(HttpStatus.OK)
    public EntryData getEntryData(@PathVariable String username) {
        return userService.getUser(username);
    }

    @GetMapping("/v2/users/{username}")
    @ResponseStatus(HttpStatus.OK)
    public UserCommand getUserCommand(@PathVariable String username) {
        return userService.getUserCommand(username);
    }

    @GetMapping("tags/{tagName}")
    @ResponseStatus(HttpStatus.OK)
    public GraphqlData getTag(@PathVariable String tagName) {
        return tagService.getTag(tagName);
    }

    @GetMapping("/v2/tags/{tagName}")
    @ResponseStatus(HttpStatus.OK)
    public HashtagCommand getTagCommand(@PathVariable String tagName) {
        return tagService.getTagCommand(tagName);
    }

    @GetMapping("/locations/{locationId}/{locationName}")
    @ResponseStatus(HttpStatus.OK)
    public GraphqlData getLocation(@PathVariable String locationId, @PathVariable String locationName) {
        return locationService.getLocation(locationId, locationName);
    }

    @GetMapping("/v2/locations/{locationId}/{locationName}")
    @ResponseStatus(HttpStatus.OK)
    public LocationCommand getLocationCommand(@PathVariable String locationId, @PathVariable String locationName) {
        return locationService.getLocationCommand(locationId, locationName);
    }
}
