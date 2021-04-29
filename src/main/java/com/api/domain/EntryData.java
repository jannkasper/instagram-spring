
package com.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntryData {

    private Entry_data entry_data;

    public Entry_data getEntry_data() {
        return entry_data;
    }

    public void setEntry_data(Entry_data entry_data) {
        this.entry_data = entry_data;
    }
}
