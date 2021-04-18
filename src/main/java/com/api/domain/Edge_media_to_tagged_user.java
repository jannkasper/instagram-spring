
package com.api.domain;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Generated("jsonschema2pojo")
public class Edge_media_to_tagged_user {

    private List<Edge__User> edges = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Edge__User> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge__User> edges) {
        this.edges = edges;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
