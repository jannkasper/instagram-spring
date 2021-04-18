
package com.api.domain;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("jsonschema2pojo")
public class Edge__User {

    private Node__User node;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Node__User getNode() {
        return node;
    }

    public void setNode(Node__User node) {
        this.node = node;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
