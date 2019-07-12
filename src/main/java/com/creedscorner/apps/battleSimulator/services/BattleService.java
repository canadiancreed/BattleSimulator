package com.creedscorner.apps.battleSimulator.services;

import com.creedscorner.apps.battleSimulator.domain.Battle;

public interface BattleService {
    Iterable<Battle> listAllBattles();

    Battle getBattleById(Integer id);

    Battle saveBattle(Battle battle);

    void deleteBattle(Integer id);
}
