
package com.api.domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Graphql {

    private User user;
    private Hashtag hashtag;
    private Location location;
    private Shortcode_media shortcode_media;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Hashtag getHashtag() {
        return hashtag;
    }

    public void setHashtag(Hashtag hashtag) {
        this.hashtag = hashtag;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Shortcode_media getShortcode_media() {
        return shortcode_media;
    }

    public void setShortcode_media(Shortcode_media shortcode_media) {
        this.shortcode_media = shortcode_media;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
