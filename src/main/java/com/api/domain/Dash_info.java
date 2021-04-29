
package com.api.domain;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Dash_info {

    private Boolean is_dash_eligible;
    private String video_dash_manifest;
    private Integer number_of_qualities;

    public Boolean getIs_dash_eligible() {
        return is_dash_eligible;
    }

    public void setIs_dash_eligible(Boolean is_dash_eligible) {
        this.is_dash_eligible = is_dash_eligible;
    }

    public String getVideo_dash_manifest() {
        return video_dash_manifest;
    }

    public void setVideo_dash_manifest(String video_dash_manifest) {
        this.video_dash_manifest = video_dash_manifest;
    }

    public Integer getNumber_of_qualities() {
        return number_of_qualities;
    }

    public void setNumber_of_qualities(Integer number_of_qualities) {
        this.number_of_qualities = number_of_qualities;
    }
}
