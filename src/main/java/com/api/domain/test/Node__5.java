
package com.api.domain.test;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Node__5 {

    private String __typename;
    private String id;
    private String shortcode;
    private Dimensions__2 dimensions;
    private String display_url;
    private Edge_media_to_tagged_user__2 edge_media_to_tagged_user;
    private Object fact_check_overall_rating;
    private Object fact_check_information;
    private Object gating_info;
    private Sharing_friction_info__2 sharing_friction_info;
    private Object media_overlay_info;
    private String media_preview;
    private Owner__2 owner;
    private Boolean is_video;
    private String accessibility_caption;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String get__typename() {
        return __typename;
    }

    public void set__typename(String __typename) {
        this.__typename = __typename;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    public Dimensions__2 getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions__2 dimensions) {
        this.dimensions = dimensions;
    }

    public String getDisplay_url() {
        return display_url;
    }

    public void setDisplay_url(String display_url) {
        this.display_url = display_url;
    }

    public Edge_media_to_tagged_user__2 getEdge_media_to_tagged_user() {
        return edge_media_to_tagged_user;
    }

    public void setEdge_media_to_tagged_user(Edge_media_to_tagged_user__2 edge_media_to_tagged_user) {
        this.edge_media_to_tagged_user = edge_media_to_tagged_user;
    }

    public Object getFact_check_overall_rating() {
        return fact_check_overall_rating;
    }

    public void setFact_check_overall_rating(Object fact_check_overall_rating) {
        this.fact_check_overall_rating = fact_check_overall_rating;
    }

    public Object getFact_check_information() {
        return fact_check_information;
    }

    public void setFact_check_information(Object fact_check_information) {
        this.fact_check_information = fact_check_information;
    }

    public Object getGating_info() {
        return gating_info;
    }

    public void setGating_info(Object gating_info) {
        this.gating_info = gating_info;
    }

    public Sharing_friction_info__2 getSharing_friction_info() {
        return sharing_friction_info;
    }

    public void setSharing_friction_info(Sharing_friction_info__2 sharing_friction_info) {
        this.sharing_friction_info = sharing_friction_info;
    }

    public Object getMedia_overlay_info() {
        return media_overlay_info;
    }

    public void setMedia_overlay_info(Object media_overlay_info) {
        this.media_overlay_info = media_overlay_info;
    }

    public String getMedia_preview() {
        return media_preview;
    }

    public void setMedia_preview(String media_preview) {
        this.media_preview = media_preview;
    }

    public Owner__2 getOwner() {
        return owner;
    }

    public void setOwner(Owner__2 owner) {
        this.owner = owner;
    }

    public Boolean getIs_video() {
        return is_video;
    }

    public void setIs_video(Boolean is_video) {
        this.is_video = is_video;
    }

    public String getAccessibility_caption() {
        return accessibility_caption;
    }

    public void setAccessibility_caption(String accessibility_caption) {
        this.accessibility_caption = accessibility_caption;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
