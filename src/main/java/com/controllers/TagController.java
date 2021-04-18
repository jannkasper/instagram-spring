package com.controllers;

import com.api.domain.Tag;
import com.services.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping(TagController.BASE_URL)
@RestController
public class TagController {

    public static final String BASE_URL = "/api/tags";

    private TagService tagService;

    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping("{name}")
    @ResponseStatus(HttpStatus.OK)
    public Tag getTagByName(@PathVariable String name) {
        return tagService.getTag(name);
    }
}
