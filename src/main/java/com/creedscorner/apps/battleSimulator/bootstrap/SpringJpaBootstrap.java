package com.creedscorner.apps.battleSimulator.bootstrap;

import com.creedscorner.apps.battleSimulator.domain.Army;
import com.creedscorner.apps.battleSimulator.domain.Battle;
import com.creedscorner.apps.battleSimulator.domain.Combatant;
import com.creedscorner.apps.battleSimulator.repositories.ArmyRepository;
import com.creedscorner.apps.battleSimulator.repositories.BattleRepository;
import com.creedscorner.apps.battleSimulator.repositories.CombatantRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class SpringJpaBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private ArmyRepository armyRepository;
    private BattleRepository battleRepository;
    private CombatantRepository combatantRepository;

    private Logger log = LogManager.getLogger(SpringJpaBootstrap.class);

    @Autowired
    public void setBattleRepository(ArmyRepository armyRepository,
                                    BattleRepository battleRepository,
                                    CombatantRepository combatantRepository) {

        this.armyRepository = armyRepository;
        this.battleRepository = battleRepository;
        this.combatantRepository = combatantRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        loadBattles();
        loadArmies();
        loadCombatants();
    }

    private void loadBattles() {
        Battle battleOne = new Battle();

        battleOne.setDescription("Spring Framework Guru Shirt");
        battleOne.setArmyTotal(3);
//        battleOne.setArmyIDs(new ArrayList<>(Arrays.asList(1,2,3)));
        battleOne.setSoldierTotal(247);

        battleRepository.save(battleOne);

        log.info("Saved battle - id: " + battleOne.getId());

        Battle battleTwo = new Battle();
        battleTwo.setDescription("Spring Framework Guru Mug");
        battleTwo.setArmyTotal(2);
//        battleTwo.setArmyIDs(new ArrayList<>(Arrays.asList(1,3)));
        battleTwo.setSoldierTotal(30);
        battleRepository.save(battleTwo);

        log.info("Saved battle - id: " + battleTwo.getId());
    }

    private void loadArmies() {
        Army armyOne = new Army();

        armyOne.setArmyName("One");
        armyOne.setCombatantTotal(String.valueOf(100));

        armyRepository.save(armyOne);

        log.info("Saved army - id: " + armyOne.getId());

        Army armyTwo = new Army();

        armyTwo.setArmyName("Two");
        armyTwo.setCombatantTotal(String.valueOf(50));

        armyRepository.save(armyTwo);

        log.info("Saved army - id: " + armyTwo.getId());
    }

    private void loadCombatants() {
        Combatant combatantOne = new Combatant();

        combatantOne.setLevel(1);
        combatantOne.setName("Dood");

        combatantRepository.save(combatantOne);

        log.info("Saved combatant - id: " + combatantOne.getId());

        Combatant combatantTwo = new Combatant();

        combatantTwo.setLevel(4);
        combatantTwo.setName("Guy");

        combatantRepository.save(combatantTwo);

        log.info("Saved combatant - id: " + combatantTwo.getId());
    }
}