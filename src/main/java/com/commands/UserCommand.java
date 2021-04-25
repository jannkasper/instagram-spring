package com.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class UserCommand {
    private String id;
    private String userImageUrl;
    private String username;
    private String name;

    private String bio;
    private String bioUrl;
    private String bioUrlName;

    private Integer postCount;
    private Integer followersCount;
    private Integer followingsCount;

    private Boolean isVerified;
    private Boolean isPrivate;
    private Boolean hasClips;
    private Boolean hasStories;

    MutualFollowCommand mutualFollow;
    private List<Node__PostCommand> postArray;
    private List<Node__PostCommand> timelineMedia;
}
