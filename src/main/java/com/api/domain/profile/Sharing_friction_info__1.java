
package com.api.domain.profile;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Sharing_friction_info__1 {

    private Boolean should_have_sharing_friction;
    private Object bloks_app_url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getShould_have_sharing_friction() {
        return should_have_sharing_friction;
    }

    public void setShould_have_sharing_friction(Boolean should_have_sharing_friction) {
        this.should_have_sharing_friction = should_have_sharing_friction;
    }

    public Object getBloks_app_url() {
        return bloks_app_url;
    }

    public void setBloks_app_url(Object bloks_app_url) {
        this.bloks_app_url = bloks_app_url;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
