
package com.api.domain;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Generated("jsonschema2pojo")
public class Edge_web_feed_timeline {

    private Page_info page_info;
    private List<Edge__Post> edges = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Page_info getPage_info() {
        return page_info;
    }

    public void setPage_info(Page_info page_info) {
        this.page_info = page_info;
    }

    public List<Edge__Post> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge__Post> edges) {
        this.edges = edges;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
