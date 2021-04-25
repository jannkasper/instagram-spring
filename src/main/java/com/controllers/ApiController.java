package com.controllers;

import com.api.domain.FeedData;
import com.api.domain.GraphqlData;
import com.api.domain.UserData;
import com.api.domain.EntryData;
import com.commands.Edge_owner_to_timeline_mediaCommand;
import com.commands.Shortcode_mediaCommand;
import com.commands.UserCommand;
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

    public ApiController(UserService userService, PostService postService, TagService tagService) {
        this.userService = userService;
        this.postService = postService;
        this.tagService = tagService;
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
    public EntryData getPostFeed(@PathVariable String username) {
        return userService.getUser(username);
    }

    @GetMapping("tags/{name}")
    @ResponseStatus(HttpStatus.OK)
    public GraphqlData getTagByName(@PathVariable String name) {
        return tagService.getTag(name);
    }
}
