
package com.api.domain.profile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Edge_threaded_comments {

    private Integer count;
    private Page_info__1 page_info;
    private List<Object> edges = null;
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

    public List<Object> getEdges() {
        return edges;
    }

    public void setEdges(List<Object> edges) {
        this.edges = edges;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}