package com.lc.work;

public class Country {
    private String country_id;
    private String country_name;
    private String region_id;

    public Country(String countryId, String countryName, String regionId) {
        this.country_id = countryId;
        this.country_name = countryName;
        this.region_id = regionId;
    }

    public String getRegion_id() {
        return region_id;
    }

    public void setRegion_id(String region_id) {
        this.region_id = region_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }
}
