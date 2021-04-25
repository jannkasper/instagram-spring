
package com.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Generated("jsonschema2pojo")
public class Entry_data {

    @JsonProperty("ProfilePage")
    private List<ProfilePage> profilePage = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<ProfilePage> getProfilePage() {
        return profilePage;
    }

    public void setProfilePage(List<ProfilePage> profilePage) {
        this.profilePage = profilePage;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
