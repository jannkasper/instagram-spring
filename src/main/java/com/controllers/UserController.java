package com.controllers;

import com.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping({"/", "/index"})
    public String getIndex(Model model) {
        model.addAttribute("userData", userService.getUserFeedDTO());

        return "index";
    }

    @GetMapping({ "/{username}"})
    public String showUser(@PathVariable String username, Model model) {
        model.addAttribute("userData", userService.getUserDTO(username));

        return "user";
    }
}
