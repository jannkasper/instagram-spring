
package com.domain;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class EdgeList<T> {

    private Integer count;
    private PageInfo page_info;
    private List<T> edges = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public PageInfo getPage_info() {
        return page_info;
    }

    public void setPage_info(PageInfo page_info) {
        this.page_info = page_info;
    }

    public List<T> getEdges() {
        return edges;
    }

    public void setEdges(List<T> edges) {
        this.edges = edges;
    }
}
