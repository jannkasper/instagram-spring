
package com.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntryDataContainer {

    private EntryData entry_data;

    public EntryData getEntry_data() {
        return entry_data;
    }

    public void setEntry_data(EntryData entry_data) {
        this.entry_data = entry_data;
    }
}
