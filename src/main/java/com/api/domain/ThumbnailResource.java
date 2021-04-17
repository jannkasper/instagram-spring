
package com.api.domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class ThumbnailResource {

    private String src;
    private Integer configWidth;
    private Integer configHeight;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Integer getConfigWidth() {
        return configWidth;
    }

    public void setConfigWidth(Integer configWidth) {
        this.configWidth = configWidth;
    }

    public Integer getConfigHeight() {
        return configHeight;
    }

    public void setConfigHeight(Integer configHeight) {
        this.configHeight = configHeight;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
