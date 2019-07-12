package com.creedscorner.apps.battleSimulator.services;

import com.creedscorner.apps.battleSimulator.domain.Battle;
import com.creedscorner.apps.battleSimulator.repositories.BattleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BattleServiceImpl implements BattleService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private BattleRepository battleRepository;

    @Autowired
    public void setBattleRepository(BattleRepository battleRepository) {
        this.battleRepository = battleRepository;
    }

    @Override
    public Iterable<Battle> listAllBattles() {
        logger.debug("listAllBattles called");
        return battleRepository.findAll();
    }

    @Override
    public Battle getBattleById(Integer id) {
        logger.debug("getBattleById called");
        return battleRepository.findById(id).orElse(null);
    }

    @Override
    public Battle saveBattle(Battle battle) {
        logger.debug("saveBattle called");
        return battleRepository.save(battle);
    }

    @Override
    public void deleteBattle(Integer id) {
        logger.debug("deleteBattle called");
        battleRepository.deleteById(id);
    }
}
