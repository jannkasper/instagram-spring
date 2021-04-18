
package com.api.domain;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("jsonschema2pojo")
public class Display_resource {

    private String src;
    private Integer config_width;
    private Integer config_height;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Integer getConfig_width() {
        return config_width;
    }

    public void setConfig_width(Integer config_width) {
        this.config_width = config_width;
    }

    public Integer getConfig_height() {
        return config_height;
    }

    public void setConfig_height(Integer config_height) {
        this.config_height = config_height;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
