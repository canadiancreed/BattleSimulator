package com.creedscorner.apps.battleSimulator.controllers;

import com.creedscorner.apps.battleSimulator.domain.Battle;
import com.creedscorner.apps.battleSimulator.services.BattleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/battles")
@CrossOrigin(origins = "http://localhost:4200")
@Api(value="onlinestore", description="Operations pertaining to battle configuration and execution")
public class BattleController {
    
    private BattleService battleService;
    
    @Autowired
    public void setBattleService(BattleService battleService) { this.battleService = battleService; }

    @ApiOperation(value = "View a list of available battles",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/json")
    public Iterable<Battle> list(Model model){
        Iterable<Battle> battleList = battleService.listAllBattles();
        
        return battleList;
    }

    @ApiOperation(value = "Search a battle with an ID",response = Battle.class)
    @RequestMapping(value = "/show/{id}", method= RequestMethod.GET, produces = "application/json")
    public Battle showBattle(@PathVariable Integer id, Model model){
        Battle battle = battleService.getBattleById(id);
        return battle;
    }

    @ApiOperation(value = "Add a battle")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity saveBattle(@RequestBody Battle battle){
        battleService.saveBattle(battle);
        return new ResponseEntity("Battle saved successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Update a battle")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity updateBattle(@PathVariable Integer id, @RequestBody Battle battle){
        Battle storedBattle = battleService.getBattleById(id);
        storedBattle.setDescription(battle.getDescription());
        storedBattle.setArmyTotal(battle.getArmyTotal());
//        storedBattle.setArmyIDs(battle.getArmyIDs());
        storedBattle.setSoldierTotal(battle.getSoldierTotal());
        battleService.saveBattle(storedBattle);
        return new ResponseEntity("Battle updated successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Delete a battle")
    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity delete(@PathVariable Integer id){
        battleService.deleteBattle(id);
        return new ResponseEntity("Battle deleted successfully", HttpStatus.OK);

    }
}
