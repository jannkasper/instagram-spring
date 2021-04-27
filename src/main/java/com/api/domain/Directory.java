
package com.api.domain;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("jsonschema2pojo")
public class Directory {

    private Country country;
    private City city;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
