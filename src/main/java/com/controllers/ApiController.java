package com.controllers;

import com.api.domain.GraphqlData;
import com.api.domain.UserData;
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
    public GraphqlData getUserByName(@PathVariable String shortcode) {
        return postService.getPost(shortcode);
    }

    @GetMapping("tags/{name}")
    @ResponseStatus(HttpStatus.OK)
    public GraphqlData getTagByName(@PathVariable String name) {
        return tagService.getTag(name);
    }
}
