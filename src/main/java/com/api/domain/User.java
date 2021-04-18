
package com.api.domain;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("jsonschema2pojo")
public class User {

    private String id;
    private String profile_pic_url;
    private String username;
    private String full_name;
    private Boolean is_verified;
    private Edge_web_feed_timeline edge_web_feed_timeline;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Edge_web_feed_timeline getEdge_web_feed_timeline() {
        return edge_web_feed_timeline;
    }

    public void setEdge_web_feed_timeline(Edge_web_feed_timeline edge_web_feed_timeline) {
        this.edge_web_feed_timeline = edge_web_feed_timeline;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
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
}
