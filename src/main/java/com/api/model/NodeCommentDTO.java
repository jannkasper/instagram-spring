package com.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class NodeCommentDTO {
    private String id;
    private String text;
    private Integer createdAt;
    private OwnerDTO owner;
    private Boolean viewerHasLiked;
    private Integer likes;
}
