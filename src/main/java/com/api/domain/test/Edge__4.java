
package com.api.domain.test;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Edge__4 {

    private Node__4 node;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Node__4 getNode() {
        return node;
    }

    public void setNode(Node__4 node) {
        this.node = node;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
