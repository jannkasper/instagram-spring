package com.controllers;

import com.api.domain.Tag;
import com.services.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TagController {

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
