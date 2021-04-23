package com.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class Shortcode_mediaCommand {
    private String id;
    private String shortcode;
    private Boolean isVideo;
    private Boolean isSidecar;
    private String videoUrl;
    private List<Display_resourceCommand> resourceArray = null;
    private Integer createdAt;
    private String description;
    private LocationCommand location;
    private OwnerCommand owner;
    private Edge_media_preview_likeCommand likes;
    private Boolean viewerHasLiked;
    private Boolean viewerHasSaved;
    private Edge_media_preview_commentCommand commentsData;
    private List<Node__SidecarCommand> sidecarArray = null;
}
