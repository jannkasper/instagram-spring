
package com.api.domain;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("jsonschema2pojo")
public class Edge__Comment {

    private Node__Comment node;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Node__Comment getNode() {
        return node;
    }

    public void setNode(Node__Comment node) {
        this.node = node;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
