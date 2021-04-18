package com.controllers;

import com.api.domain.UserData;
import com.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping(PostController.BASE_URL)
@RestController
public class PostController {

    public static final String BASE_URL = "/api/posts";

    private UserService userService;

    public PostController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public UserData getProfileFeed() {
        return userService.getUserMedia();
    }
}
