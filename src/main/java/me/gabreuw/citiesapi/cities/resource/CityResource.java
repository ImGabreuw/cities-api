package me.gabreuw.citiesapi.cities.resource;

import lombok.RequiredArgsConstructor;
import me.gabreuw.citiesapi.cities.entity.City;
import me.gabreuw.citiesapi.cities.repository.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cities")
@RequiredArgsConstructor
public class CityResource {

    private final CityRepository repository;

    @GetMapping
    public Page<City> cities(Pageable page) {
        return repository.findAll(page);
    }
}
