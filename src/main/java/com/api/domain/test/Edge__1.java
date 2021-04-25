
package com.api.domain.test;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Edge__1 {

    private Node__1 node;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Node__1 getNode() {
        return node;
    }

    public void setNode(Node__1 node) {
        this.node = node;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
