
package com.api.domain.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Node__2 {

    private String __typename;
    private String id;
    private String shortcode;
    private Dimensions__1 dimensions;
    private String display_url;
    private Edge_media_to_tagged_user__1 edge_media_to_tagged_user;
    private Object fact_check_overall_rating;
    private Object fact_check_information;
    private Object gating_info;
    private Sharing_friction_info__1 sharing_friction_info;
    private Object media_overlay_info;
    private String media_preview;
    private Owner__1 owner;
    private Boolean is_video;
    private Object accessibility_caption;
    private Dash_info__1 dash_info;
    private Boolean has_audio;
    private String tracking_token;
    private String video_url;
    private Integer video_view_count;
    private Edge_media_to_caption__1 edge_media_to_caption;
    private Edge_media_to_comment__1 edge_media_to_comment;
    private Boolean comments_disabled;
    private Integer taken_at_timestamp;
    private Edge_liked_by__1 edge_liked_by;
    private Edge_media_preview_like__1 edge_media_preview_like;
    private Object location;
    private String thumbnail_src;
    private List<Thumbnail_resource__1> thumbnail_resources = null;
    private Object felix_profile_grid_crop;
    private String product_type;
    private Clips_music_attribution_info clips_music_attribution_info;
    private Edge_sidecar_to_children edge_sidecar_to_children;
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

    public Dimensions__1 getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions__1 dimensions) {
        this.dimensions = dimensions;
    }

    public String getDisplay_url() {
        return display_url;
    }

    public void setDisplay_url(String display_url) {
        this.display_url = display_url;
    }

    public Edge_media_to_tagged_user__1 getEdge_media_to_tagged_user() {
        return edge_media_to_tagged_user;
    }

    public void setEdge_media_to_tagged_user(Edge_media_to_tagged_user__1 edge_media_to_tagged_user) {
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

    public Sharing_friction_info__1 getSharing_friction_info() {
        return sharing_friction_info;
    }

    public void setSharing_friction_info(Sharing_friction_info__1 sharing_friction_info) {
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

    public Owner__1 getOwner() {
        return owner;
    }

    public void setOwner(Owner__1 owner) {
        this.owner = owner;
    }

    public Boolean getIs_video() {
        return is_video;
    }

    public void setIs_video(Boolean is_video) {
        this.is_video = is_video;
    }

    public Object getAccessibility_caption() {
        return accessibility_caption;
    }

    public void setAccessibility_caption(Object accessibility_caption) {
        this.accessibility_caption = accessibility_caption;
    }

    public Dash_info__1 getDash_info() {
        return dash_info;
    }

    public void setDash_info(Dash_info__1 dash_info) {
        this.dash_info = dash_info;
    }

    public Boolean getHas_audio() {
        return has_audio;
    }

    public void setHas_audio(Boolean has_audio) {
        this.has_audio = has_audio;
    }

    public String getTracking_token() {
        return tracking_token;
    }

    public void setTracking_token(String tracking_token) {
        this.tracking_token = tracking_token;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public Integer getVideo_view_count() {
        return video_view_count;
    }

    public void setVideo_view_count(Integer video_view_count) {
        this.video_view_count = video_view_count;
    }

    public Edge_media_to_caption__1 getEdge_media_to_caption() {
        return edge_media_to_caption;
    }

    public void setEdge_media_to_caption(Edge_media_to_caption__1 edge_media_to_caption) {
        this.edge_media_to_caption = edge_media_to_caption;
    }

    public Edge_media_to_comment__1 getEdge_media_to_comment() {
        return edge_media_to_comment;
    }

    public void setEdge_media_to_comment(Edge_media_to_comment__1 edge_media_to_comment) {
        this.edge_media_to_comment = edge_media_to_comment;
    }

    public Boolean getComments_disabled() {
        return comments_disabled;
    }

    public void setComments_disabled(Boolean comments_disabled) {
        this.comments_disabled = comments_disabled;
    }

    public Integer getTaken_at_timestamp() {
        return taken_at_timestamp;
    }

    public void setTaken_at_timestamp(Integer taken_at_timestamp) {
        this.taken_at_timestamp = taken_at_timestamp;
    }

    public Edge_liked_by__1 getEdge_liked_by() {
        return edge_liked_by;
    }

    public void setEdge_liked_by(Edge_liked_by__1 edge_liked_by) {
        this.edge_liked_by = edge_liked_by;
    }

    public Edge_media_preview_like__1 getEdge_media_preview_like() {
        return edge_media_preview_like;
    }

    public void setEdge_media_preview_like(Edge_media_preview_like__1 edge_media_preview_like) {
        this.edge_media_preview_like = edge_media_preview_like;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public String getThumbnail_src() {
        return thumbnail_src;
    }

    public void setThumbnail_src(String thumbnail_src) {
        this.thumbnail_src = thumbnail_src;
    }

    public List<Thumbnail_resource__1> getThumbnail_resources() {
        return thumbnail_resources;
    }

    public void setThumbnail_resources(List<Thumbnail_resource__1> thumbnail_resources) {
        this.thumbnail_resources = thumbnail_resources;
    }

    public Object getFelix_profile_grid_crop() {
        return felix_profile_grid_crop;
    }

    public void setFelix_profile_grid_crop(Object felix_profile_grid_crop) {
        this.felix_profile_grid_crop = felix_profile_grid_crop;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public Clips_music_attribution_info getClips_music_attribution_info() {
        return clips_music_attribution_info;
    }

    public void setClips_music_attribution_info(Clips_music_attribution_info clips_music_attribution_info) {
        this.clips_music_attribution_info = clips_music_attribution_info;
    }

    public Edge_sidecar_to_children getEdge_sidecar_to_children() {
        return edge_sidecar_to_children;
    }

    public void setEdge_sidecar_to_children(Edge_sidecar_to_children edge_sidecar_to_children) {
        this.edge_sidecar_to_children = edge_sidecar_to_children;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
