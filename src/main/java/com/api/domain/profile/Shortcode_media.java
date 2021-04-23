
package com.api.domain.profile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Shortcode_media {

    private String __typename;
    private String id;
    private String shortcode;
    private Dimensions dimensions;
    private Object gating_info;
    private Object fact_check_overall_rating;
    private Object fact_check_information;
    private Object sensitivity_friction_info;
    private Sharing_friction_info sharing_friction_info;
    private Object media_overlay_info;
    private Object media_preview;
    private String display_url;
    private List<Display_resource> display_resources = null;
    private Boolean is_video;
    private String tracking_token;
    private Edge_media_to_tagged_user edge_media_to_tagged_user;
    private Edge_media_to_caption edge_media_to_caption;
    private Boolean caption_is_edited;
    private Boolean has_ranked_comments;
    private Edge_media_to_parent_comment edge_media_to_parent_comment;
    private Edge_media_to_hoisted_comment edge_media_to_hoisted_comment;
    private Edge_media_preview_comment edge_media_preview_comment;
    private Boolean comments_disabled;
    private Boolean commenting_disabled_for_viewer;
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
    private Owner__2 owner;
    private Boolean is_ad;
    private Edge_web_media_to_related_media edge_web_media_to_related_media;
    private Edge_sidecar_to_children edge_sidecar_to_children;
    private Edge_related_profiles edge_related_profiles;
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

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
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

    public Object getSensitivity_friction_info() {
        return sensitivity_friction_info;
    }

    public void setSensitivity_friction_info(Object sensitivity_friction_info) {
        this.sensitivity_friction_info = sensitivity_friction_info;
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

    public Object getMedia_preview() {
        return media_preview;
    }

    public void setMedia_preview(Object media_preview) {
        this.media_preview = media_preview;
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

    public Edge_media_to_caption getEdge_media_to_caption() {
        return edge_media_to_caption;
    }

    public void setEdge_media_to_caption(Edge_media_to_caption edge_media_to_caption) {
        this.edge_media_to_caption = edge_media_to_caption;
    }

    public Boolean getCaption_is_edited() {
        return caption_is_edited;
    }

    public void setCaption_is_edited(Boolean caption_is_edited) {
        this.caption_is_edited = caption_is_edited;
    }

    public Boolean getHas_ranked_comments() {
        return has_ranked_comments;
    }

    public void setHas_ranked_comments(Boolean has_ranked_comments) {
        this.has_ranked_comments = has_ranked_comments;
    }

    public Edge_media_to_parent_comment getEdge_media_to_parent_comment() {
        return edge_media_to_parent_comment;
    }

    public void setEdge_media_to_parent_comment(Edge_media_to_parent_comment edge_media_to_parent_comment) {
        this.edge_media_to_parent_comment = edge_media_to_parent_comment;
    }

    public Edge_media_to_hoisted_comment getEdge_media_to_hoisted_comment() {
        return edge_media_to_hoisted_comment;
    }

    public void setEdge_media_to_hoisted_comment(Edge_media_to_hoisted_comment edge_media_to_hoisted_comment) {
        this.edge_media_to_hoisted_comment = edge_media_to_hoisted_comment;
    }

    public Edge_media_preview_comment getEdge_media_preview_comment() {
        return edge_media_preview_comment;
    }

    public void setEdge_media_preview_comment(Edge_media_preview_comment edge_media_preview_comment) {
        this.edge_media_preview_comment = edge_media_preview_comment;
    }

    public Boolean getComments_disabled() {
        return comments_disabled;
    }

    public void setComments_disabled(Boolean comments_disabled) {
        this.comments_disabled = comments_disabled;
    }

    public Boolean getCommenting_disabled_for_viewer() {
        return commenting_disabled_for_viewer;
    }

    public void setCommenting_disabled_for_viewer(Boolean commenting_disabled_for_viewer) {
        this.commenting_disabled_for_viewer = commenting_disabled_for_viewer;
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

    public Owner__2 getOwner() {
        return owner;
    }

    public void setOwner(Owner__2 owner) {
        this.owner = owner;
    }

    public Boolean getIs_ad() {
        return is_ad;
    }

    public void setIs_ad(Boolean is_ad) {
        this.is_ad = is_ad;
    }

    public Edge_web_media_to_related_media getEdge_web_media_to_related_media() {
        return edge_web_media_to_related_media;
    }

    public void setEdge_web_media_to_related_media(Edge_web_media_to_related_media edge_web_media_to_related_media) {
        this.edge_web_media_to_related_media = edge_web_media_to_related_media;
    }

    public Edge_sidecar_to_children getEdge_sidecar_to_children() {
        return edge_sidecar_to_children;
    }

    public void setEdge_sidecar_to_children(Edge_sidecar_to_children edge_sidecar_to_children) {
        this.edge_sidecar_to_children = edge_sidecar_to_children;
    }

    public Edge_related_profiles getEdge_related_profiles() {
        return edge_related_profiles;
    }

    public void setEdge_related_profiles(Edge_related_profiles edge_related_profiles) {
        this.edge_related_profiles = edge_related_profiles;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
