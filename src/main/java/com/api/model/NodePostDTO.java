package com.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class NodePostDTO {
    private String id;
    private String shortcode;
    private Boolean isVideo;
    private Boolean isSidecar;
    private String videoUrl;
    private List<DisplayResourceDTO> resourceArray = null;
    private Integer createdAt;
//    private Edge_media_to_caption edge_media_to_caption;
    private String description;
    private LocationDTO location;
    private OwnerDTO owner;
    private EdgeListLikeDTO likes;
    private Boolean viewerHasLiked;
    private Boolean viewerHasSaved;
    private EdgeListCommentDTO commentsData;
    private List<NodeSidecarDTO> sidecarArray = null;

    private String postId;
    private Integer likeCount;
    private Integer commentCount;
    private String thumbnailSrc;
    private List<ThumbnailResourceDTO> thumbnailArray;
}
