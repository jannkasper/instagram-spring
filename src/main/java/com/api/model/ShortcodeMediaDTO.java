package com.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class ShortcodeMediaDTO {
    private String id;
    private String shortcode;
    private Boolean isVideo;
    private Boolean isSidecar;
    private String videoUrl;
    private List<DisplayResourceDTO> resourceArray = null;
    private Integer createdAt;
    private String description;
    private LocationDTO location;
    private OwnerDTO owner;
    private EdgeListLikeDTO likes;
    private Boolean viewerHasLiked;
    private Boolean viewerHasSaved;
    private EdgeListCommentDTO commentsData;
    private List<NodeSidecarDTO> sidecarArray = null;
}
