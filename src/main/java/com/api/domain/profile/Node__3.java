
package com.api.domain.profile;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Node__3 {

    private String id;
    private String text;
    private Integer created_at;
    private Boolean did_report_as_spam;
    private Owner owner;
    private Boolean viewer_has_liked;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
