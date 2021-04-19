package com.controllers;

import com.api.domain.GraphqlData;
import com.api.domain.UserData;
import com.commands.UserCommand;
import com.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin(maxAge = 3600)
@RequestMapping(UserController.BASE_URL)
@RestController
public class UserController {

    public static final String BASE_URL = "/api";

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public UserData getUserFeed() {
        return userService.getUserMedia();
    }

    @GetMapping("/command/posts")
    @ResponseStatus(HttpStatus.OK)
    public UserCommand getUserFeedCommand() {
        return userService.getUserMediaCommand();
    }

//    @GetMapping("/users/{username}")
//    @ResponseStatus(HttpStatus.OK)
//    public GraphqlData getUserByName(@PathVariable String username) {
//        return userService.getUser(username);
//    }
}
