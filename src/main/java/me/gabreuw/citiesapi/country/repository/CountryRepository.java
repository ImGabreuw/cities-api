package me.gabreuw.citiesapi.country.repository;

import me.gabreuw.citiesapi.country.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
