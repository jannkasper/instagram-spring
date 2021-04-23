package com.controllers;

import com.services.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping({ "/p/{shortcode}"})
    public String getUserFeed(@PathVariable String shortcode, Model model) {
        model.addAttribute("postData", postService.getPost(shortcode));

        return "post";
    }
}
