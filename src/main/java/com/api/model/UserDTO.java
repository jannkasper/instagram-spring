package com.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class UserDTO {
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

    MutualFollowDTO mutualFollow;
    private List<NodePostDTO> postArray;
    private EdgeListPostDTO timelineMedia;
}
