package com.creedscorner.apps.battleSimulator.services;

import com.creedscorner.apps.battleSimulator.domain.Combatant;
import com.creedscorner.apps.battleSimulator.repositories.CombatantRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CombatantServiceImpl implements CombatantService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private CombatantRepository combatantRepository;

    @Autowired
    public void setCombatantRepository(CombatantRepository combatantRepository) {
        this.combatantRepository = combatantRepository;
    }

    @Override
    public Iterable<Combatant> listAllCombatants() {
        logger.debug("listAllCombatants called");
        return combatantRepository.findAll();
    }

    @Override
    public Combatant getCombatantById(Integer id) {
        logger.debug("getCombatantById called");
        return combatantRepository.findById(id).orElse(null);
    }

    @Override
    public Combatant saveCombatant(Combatant combatant) {
        logger.debug("saveCombatant called");
        return combatantRepository.save(combatant);
    }

    @Override
    public void deleteCombatant(Integer id) {
        logger.debug("deleteCombatant called");
        combatantRepository.deleteById(id);
    }
}