
package com.api.domain;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Node__Comment {

    private String id;
    private String text;
    private Integer created_at;
    private Boolean did_report_as_spam;
    private Owner owner;
    private Boolean viewer_has_liked;
    private Edge_liked_by edge_liked_by;
    private Boolean is_restricted_pending;
    private Edge_threaded_comments edge_threaded_comments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Integer created_at) {
        this.created_at = created_at;
    }

    public Boolean getDid_report_as_spam() {
        return did_report_as_spam;
    }

    public void setDid_report_as_spam(Boolean did_report_as_spam) {
        this.did_report_as_spam = did_report_as_spam;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getViewer_has_liked() {
        return viewer_has_liked;
    }

    public void setViewer_has_liked(Boolean viewer_has_liked) {
        this.viewer_has_liked = viewer_has_liked;
    }
    public Edge_liked_by getEdge_liked_by() {
        return edge_liked_by;
    }

    public void setEdge_liked_by(Edge_liked_by edge_liked_by) {
        this.edge_liked_by = edge_liked_by;
    }

    public Boolean getIs_restricted_pending() {
        return is_restricted_pending;
    }

    public void setIs_restricted_pending(Boolean is_restricted_pending) {
        this.is_restricted_pending = is_restricted_pending;
    }

    public Edge_threaded_comments getEdge_threaded_comments() {
        return edge_threaded_comments;
    }

    public void setEdge_threaded_comments(Edge_threaded_comments edge_threaded_comments) {
        this.edge_threaded_comments = edge_threaded_comments;
    }
}
