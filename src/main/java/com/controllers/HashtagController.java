package com.controllers;

import com.services.HashtagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class HashtagController {

    private HashtagService tagService;

    public HashtagController(HashtagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping({ "/tags/{tagName}"})
    public String showHashtag(@PathVariable String tagName, Model model) {
        model.addAttribute("tagData", tagService.getHashtagDTO(tagName));

        return "tag";
    }
}
