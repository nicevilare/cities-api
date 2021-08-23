package com.github.nicevilare.citiesapi.countries.reporitory;

import com.github.nicevilare.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository<Country, Long> {
}
