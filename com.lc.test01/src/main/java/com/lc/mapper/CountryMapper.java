package com.lc.mapper;

import com.lc.work.Country;

import java.util.List;

public interface CountryMapper {
    List selectAllCountries();

    Country selectCountries(String name);


}
