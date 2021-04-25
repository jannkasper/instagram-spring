
package com.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntryData {

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
