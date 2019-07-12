package com.creedscorner.apps.battleSimulator.services;

import com.creedscorner.apps.battleSimulator.domain.Army;
import com.creedscorner.apps.battleSimulator.repositories.ArmyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArmyServiceImpl implements ArmyService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private ArmyRepository armyRepository;

    @Autowired
    public void setArmyRepository(ArmyRepository armyRepository) {
        this.armyRepository = armyRepository;
    }

    @Override
    public Iterable<Army> listAllArmys() {
        logger.debug("listAllArmys called");
        return armyRepository.findAll();
    }

    @Override
    public Army getArmyById(Integer id) {
        logger.debug("getArmyById called");
        return armyRepository.findById(id).orElse(null);
    }

    @Override
    public Army saveArmy(Army army) {
        logger.debug("saveArmy called");
        return armyRepository.save(army);
    }

    @Override
    public void deleteArmy(Integer id) {
        logger.debug("deleteArmy called");
        armyRepository.deleteById(id);
    }
}
