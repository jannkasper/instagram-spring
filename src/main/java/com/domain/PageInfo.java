
package com.domain;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class PageInfo {

    private Boolean has_next_page;
    private String end_cursor;

    public Boolean getHas_next_page() {
        return has_next_page;
    }

    public void setHas_next_page(Boolean has_next_page) {
        this.has_next_page = has_next_page;
    }

    public String getEnd_cursor() {
        return end_cursor;
    }

    public void setEnd_cursor(String end_cursor) {
        this.end_cursor = end_cursor;
    }
}
