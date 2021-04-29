
package com.api.domain;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class User {

    private String id;
    private String profile_pic_url;
    private String username;
    private String full_name;
    private Boolean is_verified;
    private Edge<Edge_post> edge_web_feed_timeline;
    private Edge<Edge_post> edge_owner_to_timeline_media;
    private String biography;
    private Boolean blocked_by_viewer;
    private Boolean restricted_by_viewer;
    private Boolean country_block;
    private String external_url;
    private String external_url_linkshimmed;
    private Edge<Object> edge_followed_by;
    private String fbid;
    private Boolean followed_by_viewer;
    private Edge<Object> edge_follow;
    private Boolean follows_viewer;
    private Boolean has_ar_effects;
    private Boolean has_clips;
    private Boolean has_guides;
    private Boolean has_channel;
    private Boolean has_blocked_viewer;
    private Integer highlight_reel_count;
    private Boolean has_requested_viewer;
    private Boolean is_business_account;
    private Boolean is_professional_account;
    private Boolean is_joined_recently;
    private String business_category_name;
    private Object overall_category_name;
    private String category_enum;
    private Object category_name;
    private Boolean is_private;
    private Edge<Object> edge_mutual_followed_by;
    private String profile_pic_url_hd;
    private Boolean requested_by_viewer;
    private Boolean should_show_category;
    private Object connected_fb_page;
    private Edge<Edge_post> edge_felix_video_timeline;
    private Edge<Object> edge_saved_media;
    private Edge<Object> edge_media_collections;

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

    public Edge<Edge_post> getEdge_web_feed_timeline() {
        return edge_web_feed_timeline;
    }

    public void setEdge_web_feed_timeline(Edge<Edge_post> edge_web_feed_timeline) {
        this.edge_web_feed_timeline = edge_web_feed_timeline;
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

    public Edge<Edge_post> getEdge_owner_to_timeline_media() {
        return edge_owner_to_timeline_media;
    }

    public void setEdge_owner_to_timeline_media(Edge<Edge_post> edge_owner_to_timeline_media) {
        this.edge_owner_to_timeline_media = edge_owner_to_timeline_media;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public Boolean getBlocked_by_viewer() {
        return blocked_by_viewer;
    }

    public void setBlocked_by_viewer(Boolean blocked_by_viewer) {
        this.blocked_by_viewer = blocked_by_viewer;
    }

    public Boolean getRestricted_by_viewer() {
        return restricted_by_viewer;
    }

    public void setRestricted_by_viewer(Boolean restricted_by_viewer) {
        this.restricted_by_viewer = restricted_by_viewer;
    }

    public Boolean getCountry_block() {
        return country_block;
    }

    public void setCountry_block(Boolean country_block) {
        this.country_block = country_block;
    }

    public String getExternal_url() {
        return external_url;
    }

    public void setExternal_url(String external_url) {
        this.external_url = external_url;
    }

    public String getExternal_url_linkshimmed() {
        return external_url_linkshimmed;
    }

    public void setExternal_url_linkshimmed(String external_url_linkshimmed) {
        this.external_url_linkshimmed = external_url_linkshimmed;
    }

    public Edge<Object> getEdge_followed_by() {
        return edge_followed_by;
    }

    public void setEdge_followed_by(Edge<Object> edge_followed_by) {
        this.edge_followed_by = edge_followed_by;
    }

    public String getFbid() {
        return fbid;
    }

    public void setFbid(String fbid) {
        this.fbid = fbid;
    }

    public Boolean getFollowed_by_viewer() {
        return followed_by_viewer;
    }

    public void setFollowed_by_viewer(Boolean followed_by_viewer) {
        this.followed_by_viewer = followed_by_viewer;
    }

    public Edge<Object> getEdge_follow() {
        return edge_follow;
    }

    public void setEdge_follow(Edge<Object> edge_follow) {
        this.edge_follow = edge_follow;
    }

    public Boolean getFollows_viewer() {
        return follows_viewer;
    }

    public void setFollows_viewer(Boolean follows_viewer) {
        this.follows_viewer = follows_viewer;
    }

    public Boolean getHas_ar_effects() {
        return has_ar_effects;
    }

    public void setHas_ar_effects(Boolean has_ar_effects) {
        this.has_ar_effects = has_ar_effects;
    }

    public Boolean getHas_clips() {
        return has_clips;
    }

    public void setHas_clips(Boolean has_clips) {
        this.has_clips = has_clips;
    }

    public Boolean getHas_guides() {
        return has_guides;
    }

    public void setHas_guides(Boolean has_guides) {
        this.has_guides = has_guides;
    }

    public Boolean getHas_channel() {
        return has_channel;
    }

    public void setHas_channel(Boolean has_channel) {
        this.has_channel = has_channel;
    }

    public Boolean getHas_blocked_viewer() {
        return has_blocked_viewer;
    }

    public void setHas_blocked_viewer(Boolean has_blocked_viewer) {
        this.has_blocked_viewer = has_blocked_viewer;
    }

    public Integer getHighlight_reel_count() {
        return highlight_reel_count;
    }

    public void setHighlight_reel_count(Integer highlight_reel_count) {
        this.highlight_reel_count = highlight_reel_count;
    }

    public Boolean getHas_requested_viewer() {
        return has_requested_viewer;
    }

    public void setHas_requested_viewer(Boolean has_requested_viewer) {
        this.has_requested_viewer = has_requested_viewer;
    }

    public Boolean getIs_business_account() {
        return is_business_account;
    }

    public void setIs_business_account(Boolean is_business_account) {
        this.is_business_account = is_business_account;
    }

    public Boolean getIs_professional_account() {
        return is_professional_account;
    }

    public void setIs_professional_account(Boolean is_professional_account) {
        this.is_professional_account = is_professional_account;
    }

    public Boolean getIs_joined_recently() {
        return is_joined_recently;
    }

    public void setIs_joined_recently(Boolean is_joined_recently) {
        this.is_joined_recently = is_joined_recently;
    }

    public String getBusiness_category_name() {
        return business_category_name;
    }

    public void setBusiness_category_name(String business_category_name) {
        this.business_category_name = business_category_name;
    }

    public Object getOverall_category_name() {
        return overall_category_name;
    }

    public void setOverall_category_name(Object overall_category_name) {
        this.overall_category_name = overall_category_name;
    }

    public String getCategory_enum() {
        return category_enum;
    }

    public void setCategory_enum(String category_enum) {
        this.category_enum = category_enum;
    }

    public Object getCategory_name() {
        return category_name;
    }

    public void setCategory_name(Object category_name) {
        this.category_name = category_name;
    }

    public Boolean getIs_private() {
        return is_private;
    }

    public void setIs_private(Boolean is_private) {
        this.is_private = is_private;
    }

    public Edge<Object> getEdge_mutual_followed_by() {
        return edge_mutual_followed_by;
    }

    public void setEdge_mutual_followed_by(Edge<Object> edge_mutual_followed_by) {
        this.edge_mutual_followed_by = edge_mutual_followed_by;
    }

    public String getProfile_pic_url_hd() {
        return profile_pic_url_hd;
    }

    public void setProfile_pic_url_hd(String profile_pic_url_hd) {
        this.profile_pic_url_hd = profile_pic_url_hd;
    }

    public Boolean getRequested_by_viewer() {
        return requested_by_viewer;
    }

    public void setRequested_by_viewer(Boolean requested_by_viewer) {
        this.requested_by_viewer = requested_by_viewer;
    }

    public Boolean getShould_show_category() {
        return should_show_category;
    }

    public void setShould_show_category(Boolean should_show_category) {
        this.should_show_category = should_show_category;
    }

    public Object getConnected_fb_page() {
        return connected_fb_page;
    }

    public void setConnected_fb_page(Object connected_fb_page) {
        this.connected_fb_page = connected_fb_page;
    }

    public Edge<Edge_post> getEdge_felix_video_timeline() {
        return edge_felix_video_timeline;
    }

    public void setEdge_felix_video_timeline(Edge<Edge_post> edge_felix_video_timeline) {
        this.edge_felix_video_timeline = edge_felix_video_timeline;
    }

    public Edge<Object> getEdge_saved_media() {
        return edge_saved_media;
    }

    public void setEdge_saved_media(Edge<Object> edge_saved_media) {
        this.edge_saved_media = edge_saved_media;
    }

    public Edge<Object> getEdge_media_collections() {
        return edge_media_collections;
    }

    public void setEdge_media_collections(Edge<Object> edge_media_collections) {
        this.edge_media_collections = edge_media_collections;
    }
}
