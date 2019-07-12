package com.creedscorner.apps.battleSimulator.services;

import com.creedscorner.apps.battleSimulator.domain.Combatant;

public interface CombatantService {
    Iterable<Combatant> listAllCombatants();

    Combatant getCombatantById(Integer id);

    Combatant saveCombatant(Combatant combatant);

    void deleteCombatant(Integer id);
}