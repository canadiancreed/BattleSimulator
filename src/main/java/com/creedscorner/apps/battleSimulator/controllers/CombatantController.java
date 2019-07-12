package com.creedscorner.apps.battleSimulator.controllers;

import com.creedscorner.apps.battleSimulator.services.CombatantService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/combatants")
@CrossOrigin(origins = "http://localhost:4200")
@Api(value="onlinestore", description="Operations pertaining to battle configuration and execution")
public class CombatantController {

    private CombatantService combatantService;

    @Autowired
    public void setCombatantService(CombatantService combatantService) { this.combatantService = combatantService; }
}
