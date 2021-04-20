package com.controllers;

import com.api.domain.GraphqlData;
import com.api.domain.UserData;
import com.commands.UserCommand;
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
    private TagService tagService;

    public ApiController(UserService userService, TagService tagService) {
        this.userService = userService;
        this.tagService = tagService;
    }

    @GetMapping("/posts/pure")
    @ResponseStatus(HttpStatus.OK)
    public UserData getUserFeed() {
        return userService.getUserMedia();
    }

    @GetMapping("/posts")
    @ResponseStatus(HttpStatus.OK)
    public UserCommand getUserFeedCommand() {
        return userService.getUserMediaCommand();
    }

    @GetMapping("tags/{name}/pure")
    @ResponseStatus(HttpStatus.OK)
    public GraphqlData getTagByName(@PathVariable String name) {
        return tagService.getTag(name);
    }

//    @GetMapping("/users/{username}")
//    @ResponseStatus(HttpStatus.OK)
//    public GraphqlData getUserByName(@PathVariable String username) {
//        return userService.getUser(username);
//    }
}
