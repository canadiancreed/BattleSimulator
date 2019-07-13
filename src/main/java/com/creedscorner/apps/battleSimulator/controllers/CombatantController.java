package com.creedscorner.apps.battleSimulator.controllers;

import com.creedscorner.apps.battleSimulator.domain.Combatant;
import com.creedscorner.apps.battleSimulator.services.CombatantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/combatants")
@CrossOrigin(origins = "http://localhost:4200")
@Api(value="onlinestore", description="Operations pertaining to battle configuration and execution")
public class CombatantController {

    private CombatantService combatantService;

    @Autowired
    public void setCombatantService(CombatantService combatantService) { this.combatantService = combatantService; }

    @ApiOperation(value = "View a list of available combatants",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/json")
    public Iterable<Combatant> list(Model model){
        Iterable<Combatant> combatantList = combatantService.listAllCombatants();

        return combatantList;
    }
}
