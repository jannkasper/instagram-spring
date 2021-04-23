
package com.api.domain.profile;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Graphql {

    private Shortcode_media shortcode_media;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Shortcode_media getShortcode_media() {
        return shortcode_media;
    }

    public void setShortcode_media(Shortcode_media shortcode_media) {
        this.shortcode_media = shortcode_media;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
