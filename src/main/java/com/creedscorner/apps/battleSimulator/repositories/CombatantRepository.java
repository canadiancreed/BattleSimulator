package com.creedscorner.apps.battleSimulator.repositories;

import com.creedscorner.apps.battleSimulator.domain.Combatant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CombatantRepository extends CrudRepository<Combatant, Integer> {
}