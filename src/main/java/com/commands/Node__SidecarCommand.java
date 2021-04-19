package com.commands;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class Node__SidecarCommand {
    private String id;
    private String shortcode;
    private Boolean isVideo;
    private List<Display_resourceCommand> resourceArray = null;
}
