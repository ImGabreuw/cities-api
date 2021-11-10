package me.gabreuw.citiesapi.states.resource;

import lombok.RequiredArgsConstructor;
import me.gabreuw.citiesapi.states.entity.State;
import me.gabreuw.citiesapi.states.repository.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
@RequiredArgsConstructor
public class StateResource {

    private final StateRepository repository;

    @GetMapping
    public List<State> states() {
        return repository.findAll();
    }

}
