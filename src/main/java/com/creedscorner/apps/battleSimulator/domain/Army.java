package com.creedscorner.apps.battleSimulator.domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Army {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "The database generated army ID")
    private int id;

    @ApiModelProperty(notes = "The army name")
    private String armyName;

    @ApiModelProperty(notes = "Amount of combatants in army")
    private String combatantTotal;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getArmyName() {
        return armyName;
    }

    public void setArmyName(final String armyName) {
        this.armyName = armyName;
    }

    public String getCombatantTotal() { return combatantTotal; }

    public void setCombatantTotal(final String combatantTotal) { this.combatantTotal = combatantTotal; }
}
