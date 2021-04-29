
package com.api.domain;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class Edge_media_to_parent_comment {

    private Integer count;
    private Page_info page_info;
    private List<Edge__Comment> edges = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Page_info getPage_info() {
        return page_info;
    }

    public void setPage_info(Page_info page_info) {
        this.page_info = page_info;
    }

    public List<Edge__Comment> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge__Comment> edges) {
        this.edges = edges;
    }
}
