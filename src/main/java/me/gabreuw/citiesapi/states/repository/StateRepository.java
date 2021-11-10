package me.gabreuw.citiesapi.states.repository;

import me.gabreuw.citiesapi.states.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
