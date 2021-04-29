
package com.api.domain;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class FeedData {

    private Data data;
    private String status;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
