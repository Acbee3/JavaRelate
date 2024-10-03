package com.lc.mapper;

import com.lc.work.Country;

import java.util.List;

public interface CountryMapper {
    List selectAllCountries();

    Country selectCountries(String name);

    Country selectDetailCountries(Country country);

    int insertCountry(Country country);

    int updateCountryInfo(String country_id, Country country);

}
