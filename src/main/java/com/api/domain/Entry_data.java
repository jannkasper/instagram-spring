
package com.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class Entry_data {

    @JsonProperty("ProfilePage")
    private List<ProfilePage> profilePage = null;

    public List<ProfilePage> getProfilePage() {
        return profilePage;
    }

    public void setProfilePage(List<ProfilePage> profilePage) {
        this.profilePage = profilePage;
    }
}
