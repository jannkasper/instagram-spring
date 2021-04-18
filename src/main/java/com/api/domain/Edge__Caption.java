
package com.api.domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Edge__Caption {

    private Node__Caption node;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Node__Caption getNode() {
        return node;
    }

    public void setNode(Node__Caption node) {
        this.node = node;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
