
package com.api.domain;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class Edge_mutual_followed_by {

    private Integer count;
    private List<Object> edges = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Object> getEdges() {
        return edges;
    }

    public void setEdges(List<Object> edges) {
        this.edges = edges;
    }
}
