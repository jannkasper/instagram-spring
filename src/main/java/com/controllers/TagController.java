package com.controllers;

import com.services.HashtagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class TagController {

    private HashtagService tagService;

    public TagController(HashtagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping({ "/tags/{tagName}"})
    public String getTag(@PathVariable String tagName, Model model) {
        model.addAttribute("tagData", tagService.getHashtagDTO(tagName));

        return "tag";
    }
}
