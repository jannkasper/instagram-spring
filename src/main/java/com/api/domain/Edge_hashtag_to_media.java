
package com.api.domain;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Edge_hashtag_to_media {

    private Integer count;
    private Page_info page_info;
    private List<Edge__Post> edges = null;

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

    public List<Edge__Post> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge__Post> edges) {
        this.edges = edges;
    }
}
