
package com.api.domain;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("jsonschema2pojo")
public class Edge_follow {

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
