package com.creedscorner.apps.battleSimulator.repositories;

import com.creedscorner.apps.battleSimulator.domain.Battle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BattleRepository extends CrudRepository<Battle, Integer> {
}