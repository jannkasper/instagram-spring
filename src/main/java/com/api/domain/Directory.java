
package com.api.domain;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Directory {

    private Country country;
    private City city;

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
}
