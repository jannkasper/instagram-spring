
package com.api.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Node {

    private Boolean comments_disabled;
    private String __typename;
    private String id;
    private Edge_media_to_caption edge_media_to_caption;
    private String shortcode;
    private Edge_media_to_comment edge_media_to_comment;
    private Integer taken_at_timestamp;
    private Dimensions dimensions;
    private String display_url;
    private Edge_liked_by edge_liked_by;
    private Edge_media_preview_like edge_media_preview_like;
    private Owner owner;
    private String thumbnail_src;
    private List<Thumbnail_resource> thumbnail_resources = null;
    private Boolean is_video;
    private String accessibility_caption;
    private String product_type;
    private Integer video_view_count;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getComments_disabled() {
        return comments_disabled;
    }

    public void setComments_disabled(Boolean comments_disabled) {
        this.comments_disabled = comments_disabled;
    }

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

    public Edge_media_to_caption getEdge_media_to_caption() {
        return edge_media_to_caption;
    }

    public void setEdge_media_to_caption(Edge_media_to_caption edge_media_to_caption) {
        this.edge_media_to_caption = edge_media_to_caption;
    }

    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    public Edge_media_to_comment getEdge_media_to_comment() {
        return edge_media_to_comment;
    }

    public void setEdge_media_to_comment(Edge_media_to_comment edge_media_to_comment) {
        this.edge_media_to_comment = edge_media_to_comment;
    }

    public Integer getTaken_at_timestamp() {
        return taken_at_timestamp;
    }

    public void setTaken_at_timestamp(Integer taken_at_timestamp) {
        this.taken_at_timestamp = taken_at_timestamp;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public String getDisplay_url() {
        return display_url;
    }

    public void setDisplay_url(String display_url) {
        this.display_url = display_url;
    }

    public Edge_liked_by getEdge_liked_by() {
        return edge_liked_by;
    }

    public void setEdge_liked_by(Edge_liked_by edge_liked_by) {
        this.edge_liked_by = edge_liked_by;
    }

    public Edge_media_preview_like getEdge_media_preview_like() {
        return edge_media_preview_like;
    }

    public void setEdge_media_preview_like(Edge_media_preview_like edge_media_preview_like) {
        this.edge_media_preview_like = edge_media_preview_like;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getThumbnail_src() {
        return thumbnail_src;
    }

    public void setThumbnail_src(String thumbnail_src) {
        this.thumbnail_src = thumbnail_src;
    }

    public List<Thumbnail_resource> getThumbnail_resources() {
        return thumbnail_resources;
    }

    public void setThumbnail_resources(List<Thumbnail_resource> thumbnail_resources) {
        this.thumbnail_resources = thumbnail_resources;
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

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public Integer getVideo_view_count() {
        return video_view_count;
    }

    public void setVideo_view_count(Integer video_view_count) {
        this.video_view_count = video_view_count;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
