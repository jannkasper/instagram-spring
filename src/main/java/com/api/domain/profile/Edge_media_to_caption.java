
package com.api.domain.profile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Edge_media_to_caption {

    private List<Edge__2> edges = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Edge__2> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge__2> edges) {
        this.edges = edges;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
