package com.creedscorner.apps.battleSimulator.services;

import com.creedscorner.apps.battleSimulator.domain.Army;

public interface ArmyService {
    Iterable<Army> listAllArmys();

    Army getArmyById(Integer id);

    Army saveArmy(Army army);

    void deleteArmy(Integer id);
}