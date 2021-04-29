
package com.api.domain;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class EdgeList<T> {

    private Integer count;
    private Page_info page_info;
    private List<T> edges = null;

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

    public List<T> getEdges() {
        return edges;
    }

    public void setEdges(List<T> edges) {
        this.edges = edges;
    }
}
