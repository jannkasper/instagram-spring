package com.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class LocationDTO {
    private String id;
    private String name;
    private String slug;

    private String locationName;
    private Double lat;
    private Double lng;
    private String addressJson;
    private String locationImageUrl;
    private Integer postCount;

    private EdgeListPostDTO topMedia;
    private EdgeListPostDTO timelineMedia;
}
