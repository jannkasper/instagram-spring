
package com.api.domain.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserData {

    private Entry_data entry_data;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Entry_data getEntry_data() {
        return entry_data;
    }

    public void setEntry_data(Entry_data entry_data) {
        this.entry_data = entry_data;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
