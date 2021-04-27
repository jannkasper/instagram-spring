package com.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class LocationCommand {
    private String id;
    private String name;
    private String slug;

    private String locationName;
    private Double lat;
    private Double lng;
    private String addressJson;
    private String locationImageUrl;
    private Integer postCount;

    private Edge_owner_to_timeline_mediaCommand topMedia;
    private Edge_owner_to_timeline_mediaCommand timelineMedia;
}
