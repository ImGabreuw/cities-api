package me.gabreuw.citiesapi.country.resource;

import lombok.RequiredArgsConstructor;
import me.gabreuw.citiesapi.country.entity.Country;
import me.gabreuw.citiesapi.country.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/countries")
@RequiredArgsConstructor
public class CountryResource {

    private final CountryRepository repository;

    @GetMapping
    public Page<Country> countries(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Country> findById(@PathVariable Long id) {
        // TODO criar uma exceção customizada (CountryNotFoundException) quando não encontrar um país com o ID passado na requisição
        // TODO criar uma ExceptionHandler
        Optional<Country> countryOptional = repository.findById(id);

        if (countryOptional.isEmpty()) {
            return ResponseEntity
                    .notFound()
                    .build();
        }

        return ResponseEntity
                .ok()
                .body(countryOptional.get());
    }

}
