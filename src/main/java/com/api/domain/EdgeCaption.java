
package com.api.domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class EdgeCaption {

    private NodeCaption node;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public NodeCaption getNode() {
        return node;
    }

    public void setNode(NodeCaption node) {
        this.node = node;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
