
package com.api.domain;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Location {

    private String id;
    private String name;
    private Boolean has_public_page;
    private Double lat;
    private Double lng;
    private String slug;
    private String blurb;
    private String website;
    private String phone;
    private String primary_alias_on_fb;
    private String address_json;
    private String profile_pic_url;
    private EdgeList<Edge<Node_post>> edge_location_to_media;
    private EdgeList<Edge<Node_post>> edge_location_to_top_posts;
    private Directory directory;

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

    public Boolean getHas_public_page() {
        return has_public_page;
    }

    public void setHas_public_page(Boolean has_public_page) {
        this.has_public_page = has_public_page;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPrimary_alias_on_fb() {
        return primary_alias_on_fb;
    }

    public void setPrimary_alias_on_fb(String primary_alias_on_fb) {
        this.primary_alias_on_fb = primary_alias_on_fb;
    }

    public String getAddress_json() {
        return address_json;
    }

    public void setAddress_json(String address_json) {
        this.address_json = address_json;
    }

    public String getProfile_pic_url() {
        return profile_pic_url;
    }

    public void setProfile_pic_url(String profile_pic_url) {
        this.profile_pic_url = profile_pic_url;
    }

    public EdgeList<Edge<Node_post>> getEdge_location_to_media() {
        return edge_location_to_media;
    }

    public void setEdge_location_to_media(EdgeList<Edge<Node_post>> edge_location_to_media) {
        this.edge_location_to_media = edge_location_to_media;
    }

    public EdgeList<Edge<Node_post>> getEdge_location_to_top_posts() {
        return edge_location_to_top_posts;
    }

    public void setEdge_location_to_top_posts(EdgeList<Edge<Node_post>> edge_location_to_top_posts) {
        this.edge_location_to_top_posts = edge_location_to_top_posts;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }
}
