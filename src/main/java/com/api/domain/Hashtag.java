
package com.api.domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Hashtag {

    private String id;
    private String name;
    private Boolean allow_following;
    private Boolean is_following;
    private Boolean is_top_media_only;
    private String profile_pic_url;
    private Edge_owner_to_timeline_media edge_hashtag_to_media;
    private Edge_owner_to_timeline_media edge_hashtag_to_top_posts;
    private Edge_hashtag_to_content_advisory edge_hashtag_to_content_advisory;
    private Edge_hashtag_to_related_tags edge_hashtag_to_related_tags;
    private Edge_hashtag_to_null_state edge_hashtag_to_null_state;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAllow_following() {
        return allow_following;
    }

    public void setAllow_following(Boolean allow_following) {
        this.allow_following = allow_following;
    }

    public Boolean getIs_following() {
        return is_following;
    }

    public void setIs_following(Boolean is_following) {
        this.is_following = is_following;
    }

    public Boolean getIs_top_media_only() {
        return is_top_media_only;
    }

    public void setIs_top_media_only(Boolean is_top_media_only) {
        this.is_top_media_only = is_top_media_only;
    }

    public String getProfile_pic_url() {
        return profile_pic_url;
    }

    public void setProfile_pic_url(String profile_pic_url) {
        this.profile_pic_url = profile_pic_url;
    }

    public Edge_owner_to_timeline_media getEdge_hashtag_to_media() {
        return edge_hashtag_to_media;
    }

    public void setEdge_hashtag_to_media(Edge_owner_to_timeline_media edge_hashtag_to_media) {
        this.edge_hashtag_to_media = edge_hashtag_to_media;
    }

    public Edge_owner_to_timeline_media getEdge_hashtag_to_top_posts() {
        return edge_hashtag_to_top_posts;
    }

    public void setEdge_hashtag_to_top_posts(Edge_owner_to_timeline_media edge_hashtag_to_top_posts) {
        this.edge_hashtag_to_top_posts = edge_hashtag_to_top_posts;
    }

    public Edge_hashtag_to_content_advisory getEdge_hashtag_to_content_advisory() {
        return edge_hashtag_to_content_advisory;
    }

    public void setEdge_hashtag_to_content_advisory(Edge_hashtag_to_content_advisory edge_hashtag_to_content_advisory) {
        this.edge_hashtag_to_content_advisory = edge_hashtag_to_content_advisory;
    }

    public Edge_hashtag_to_related_tags getEdge_hashtag_to_related_tags() {
        return edge_hashtag_to_related_tags;
    }

    public void setEdge_hashtag_to_related_tags(Edge_hashtag_to_related_tags edge_hashtag_to_related_tags) {
        this.edge_hashtag_to_related_tags = edge_hashtag_to_related_tags;
    }

    public Edge_hashtag_to_null_state getEdge_hashtag_to_null_state() {
        return edge_hashtag_to_null_state;
    }

    public void setEdge_hashtag_to_null_state(Edge_hashtag_to_null_state edge_hashtag_to_null_state) {
        this.edge_hashtag_to_null_state = edge_hashtag_to_null_state;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
