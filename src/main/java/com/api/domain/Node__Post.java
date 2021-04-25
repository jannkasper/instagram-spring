
package com.api.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Node__Post {

    private String __typename;
    private String id;
    private Dimensions dimensions;
    private String display_url;
    private List<Display_resource> display_resources = null;
    private Object follow_hashtag_info;
    private Boolean is_video;
    private String tracking_token;
    private Edge_media_to_tagged_user edge_media_to_tagged_user;
    private String accessibility_caption;
    private Object attribution;
    private String shortcode;
    private Edge_media_to_caption edge_media_to_caption;
    private Edge_media_preview_comment edge_media_preview_comment;
    private Object gating_info;
    private Object fact_check_overall_rating;
    private Object fact_check_information;
    private Object sensitivity_friction_info;
    private Sharing_friction_info sharing_friction_info;
    private Object media_overlay_info;
    private String media_preview;
    private Boolean comments_disabled;
    private Integer taken_at_timestamp;
    private Edge_media_preview_like edge_media_preview_like;
    private Edge_media_to_sponsor_user edge_media_to_sponsor_user;
    private Boolean is_paid_partnership;
    private Location location;
    private Boolean viewer_has_liked;
    private Boolean viewer_has_saved;
    private Boolean viewer_has_saved_to_collection;
    private Boolean viewer_in_photo_of_you;
    private Boolean viewer_can_reshare;
    private Owner owner;
    private Edge_sidecar_to_children edge_sidecar_to_children;
    private Dash_info dash_info;
    private Boolean has_audio;
    private String product_type;
    private Object felix_profile_grid_crop;
    private Object encoding_status;
    private Boolean is_published;
    private String title;
    private Double video_duration;
    private String video_url;
    private Integer video_view_count;
    private Clips_music_attribution_info clips_music_attribution_info;
    private Edge_media_to_comment edge_media_to_comment;
    private Edge_liked_by edge_liked_by;
    private String thumbnail_src;
    private List<Thumbnail_resource> thumbnail_resources = null;
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

    public List<Display_resource> getDisplay_resources() {
        return display_resources;
    }

    public void setDisplay_resources(List<Display_resource> display_resources) {
        this.display_resources = display_resources;
    }

    public Object getFollow_hashtag_info() {
        return follow_hashtag_info;
    }

    public void setFollow_hashtag_info(Object follow_hashtag_info) {
        this.follow_hashtag_info = follow_hashtag_info;
    }

    public Boolean getIs_video() {
        return is_video;
    }

    public void setIs_video(Boolean is_video) {
        this.is_video = is_video;
    }

    public String getTracking_token() {
        return tracking_token;
    }

    public void setTracking_token(String tracking_token) {
        this.tracking_token = tracking_token;
    }

    public Edge_media_to_tagged_user getEdge_media_to_tagged_user() {
        return edge_media_to_tagged_user;
    }

    public void setEdge_media_to_tagged_user(Edge_media_to_tagged_user edge_media_to_tagged_user) {
        this.edge_media_to_tagged_user = edge_media_to_tagged_user;
    }

    public String getAccessibility_caption() {
        return accessibility_caption;
    }

    public void setAccessibility_caption(String accessibility_caption) {
        this.accessibility_caption = accessibility_caption;
    }

    public Object getAttribution() {
        return attribution;
    }

    public void setAttribution(Object attribution) {
        this.attribution = attribution;
    }

    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    public Edge_media_to_caption getEdge_media_to_caption() {
        return edge_media_to_caption;
    }

    public void setEdge_media_to_caption(Edge_media_to_caption edge_media_to_caption) {
        this.edge_media_to_caption = edge_media_to_caption;
    }

    public Edge_media_preview_comment getEdge_media_preview_comment() {
        return edge_media_preview_comment;
    }

    public void setEdge_media_preview_comment(Edge_media_preview_comment edge_media_preview_comment) {
        this.edge_media_preview_comment = edge_media_preview_comment;
    }

    public Object getGating_info() {
        return gating_info;
    }

    public void setGating_info(Object gating_info) {
        this.gating_info = gating_info;
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

    public Sharing_friction_info getSharing_friction_info() {
        return sharing_friction_info;
    }

    public void setSharing_friction_info(Sharing_friction_info sharing_friction_info) {
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

    public Edge_media_preview_like getEdge_media_preview_like() {
        return edge_media_preview_like;
    }

    public void setEdge_media_preview_like(Edge_media_preview_like edge_media_preview_like) {
        this.edge_media_preview_like = edge_media_preview_like;
    }

    public Edge_media_to_sponsor_user getEdge_media_to_sponsor_user() {
        return edge_media_to_sponsor_user;
    }

    public void setEdge_media_to_sponsor_user(Edge_media_to_sponsor_user edge_media_to_sponsor_user) {
        this.edge_media_to_sponsor_user = edge_media_to_sponsor_user;
    }

    public Boolean getIs_paid_partnership() {
        return is_paid_partnership;
    }

    public void setIs_paid_partnership(Boolean is_paid_partnership) {
        this.is_paid_partnership = is_paid_partnership;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Boolean getViewer_has_liked() {
        return viewer_has_liked;
    }

    public void setViewer_has_liked(Boolean viewer_has_liked) {
        this.viewer_has_liked = viewer_has_liked;
    }

    public Boolean getViewer_has_saved() {
        return viewer_has_saved;
    }

    public void setViewer_has_saved(Boolean viewer_has_saved) {
        this.viewer_has_saved = viewer_has_saved;
    }

    public Boolean getViewer_has_saved_to_collection() {
        return viewer_has_saved_to_collection;
    }

    public void setViewer_has_saved_to_collection(Boolean viewer_has_saved_to_collection) {
        this.viewer_has_saved_to_collection = viewer_has_saved_to_collection;
    }

    public Boolean getViewer_in_photo_of_you() {
        return viewer_in_photo_of_you;
    }

    public void setViewer_in_photo_of_you(Boolean viewer_in_photo_of_you) {
        this.viewer_in_photo_of_you = viewer_in_photo_of_you;
    }

    public Boolean getViewer_can_reshare() {
        return viewer_can_reshare;
    }

    public void setViewer_can_reshare(Boolean viewer_can_reshare) {
        this.viewer_can_reshare = viewer_can_reshare;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Edge_sidecar_to_children getEdge_sidecar_to_children() {
        return edge_sidecar_to_children;
    }

    public void setEdge_sidecar_to_children(Edge_sidecar_to_children edge_sidecar_to_children) {
        this.edge_sidecar_to_children = edge_sidecar_to_children;
    }

    public Dash_info getDash_info() {
        return dash_info;
    }

    public void setDash_info(Dash_info dash_info) {
        this.dash_info = dash_info;
    }

    public Boolean getHas_audio() {
        return has_audio;
    }

    public void setHas_audio(Boolean has_audio) {
        this.has_audio = has_audio;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public Object getFelix_profile_grid_crop() {
        return felix_profile_grid_crop;
    }

    public void setFelix_profile_grid_crop(Object felix_profile_grid_crop) {
        this.felix_profile_grid_crop = felix_profile_grid_crop;
    }

    public Object getEncoding_status() {
        return encoding_status;
    }

    public void setEncoding_status(Object encoding_status) {
        this.encoding_status = encoding_status;
    }

    public Boolean getIs_published() {
        return is_published;
    }

    public void setIs_published(Boolean is_published) {
        this.is_published = is_published;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getVideo_duration() {
        return video_duration;
    }

    public void setVideo_duration(Double video_duration) {
        this.video_duration = video_duration;
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

    public Clips_music_attribution_info getClips_music_attribution_info() {
        return clips_music_attribution_info;
    }

    public void setClips_music_attribution_info(Clips_music_attribution_info clips_music_attribution_info) {
        this.clips_music_attribution_info = clips_music_attribution_info;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Edge_media_to_comment getEdge_media_to_comment() {
        return edge_media_to_comment;
    }

    public void setEdge_media_to_comment(Edge_media_to_comment edge_media_to_comment) {
        this.edge_media_to_comment = edge_media_to_comment;
    }

    public Edge_liked_by getEdge_liked_by() {
        return edge_liked_by;
    }

    public void setEdge_liked_by(Edge_liked_by edge_liked_by) {
        this.edge_liked_by = edge_liked_by;
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

    public Object getSensitivity_friction_info() {
        return sensitivity_friction_info;
    }

    public void setSensitivity_friction_info(Object sensitivity_friction_info) {
        this.sensitivity_friction_info = sensitivity_friction_info;
    }


}