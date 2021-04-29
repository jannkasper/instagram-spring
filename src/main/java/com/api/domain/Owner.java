
package com.api.domain;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Owner {

    private String id;
    private String profile_pic_url;
    private String username;
    private Boolean followed_by_viewer;
    private String full_name;
    private Boolean is_verified;
    private Boolean is_private;
    private Boolean requested_by_viewer;
    private Boolean blocked_by_viewer;
    private Boolean has_blocked_viewer;
    private Boolean restricted_by_viewer;
    private Boolean is_unpublished;
    private Boolean pass_tiering_recommendation;
    private Edge<Edge_post> edge_owner_to_timeline_media;
    private Edge<Object> edge_followed_by;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfile_pic_url() {
        return profile_pic_url;
    }

    public void setProfile_pic_url(String profile_pic_url) {
        this.profile_pic_url = profile_pic_url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public Boolean getFollowed_by_viewer() {
        return followed_by_viewer;
    }

    public void setFollowed_by_viewer(Boolean followed_by_viewer) {
        this.followed_by_viewer = followed_by_viewer;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Boolean getIs_verified() {
        return is_verified;
    }

    public void setIs_verified(Boolean is_verified) {
        this.is_verified = is_verified;
    }

    public Boolean getIs_private() {
        return is_private;
    }

    public void setIs_private(Boolean is_private) {
        this.is_private = is_private;
    }

    public Boolean getRequested_by_viewer() {
        return requested_by_viewer;
    }

    public void setRequested_by_viewer(Boolean requested_by_viewer) {
        this.requested_by_viewer = requested_by_viewer;
    }

    public Boolean getBlocked_by_viewer() {
        return blocked_by_viewer;
    }

    public void setBlocked_by_viewer(Boolean blocked_by_viewer) {
        this.blocked_by_viewer = blocked_by_viewer;
    }

    public Boolean getHas_blocked_viewer() {
        return has_blocked_viewer;
    }

    public void setHas_blocked_viewer(Boolean has_blocked_viewer) {
        this.has_blocked_viewer = has_blocked_viewer;
    }

    public Boolean getRestricted_by_viewer() {
        return restricted_by_viewer;
    }

    public void setRestricted_by_viewer(Boolean restricted_by_viewer) {
        this.restricted_by_viewer = restricted_by_viewer;
    }

    public Boolean getIs_unpublished() {
        return is_unpublished;
    }

    public void setIs_unpublished(Boolean is_unpublished) {
        this.is_unpublished = is_unpublished;
    }

    public Boolean getPass_tiering_recommendation() {
        return pass_tiering_recommendation;
    }

    public void setPass_tiering_recommendation(Boolean pass_tiering_recommendation) {
        this.pass_tiering_recommendation = pass_tiering_recommendation;
    }

    public Edge<Edge_post> getEdge_owner_to_timeline_media() {
        return edge_owner_to_timeline_media;
    }

    public void setEdge_owner_to_timeline_media(Edge<Edge_post> edge_owner_to_timeline_media) {
        this.edge_owner_to_timeline_media = edge_owner_to_timeline_media;
    }

    public Edge<Object> getEdge_followed_by() {
        return edge_followed_by;
    }

    public void setEdge_followed_by(Edge<Object> edge_followed_by) {
        this.edge_followed_by = edge_followed_by;
    }
}
