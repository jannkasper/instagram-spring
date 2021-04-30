package com.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class HashtagDTO {
    private String id;
    private String tagName;
    private String tagImageUrl;
    private Integer postCount;

    private EdgeListPostDTO topMedia;
    private EdgeListPostDTO timelineMedia;
}
