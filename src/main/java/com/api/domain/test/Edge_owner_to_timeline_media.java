
package com.api.domain.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Edge_owner_to_timeline_media {

    private Integer count;
    private Page_info__1 page_info;
    private List<Edge__2> edges = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Page_info__1 getPage_info() {
        return page_info;
    }

    public void setPage_info(Page_info__1 page_info) {
        this.page_info = page_info;
    }

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
