
package com.api.domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Edge_media_to_comment {

    private Integer count;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
