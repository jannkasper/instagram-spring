package com.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class HashtagCommand {
    private String id;
    private String tagName;
    private String tagImageUrl;
    private Integer postCount;

    private Edge_owner_to_timeline_mediaCommand topMedia;
    private Edge_owner_to_timeline_mediaCommand timelineMedia;
}
