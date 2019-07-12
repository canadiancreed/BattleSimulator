package com.creedscorner.apps.battleSimulator.domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Battle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "The database generated battle ID")
    private int id;

    @ApiModelProperty(notes = "The battle description")
    private String description;

    @ApiModelProperty(notes = "Amount of armies present")
    private int armyTotal;

//    @ApiModelProperty(notes = "Armies present")
//    private List<Integer> armyIDs;

    @ApiModelProperty(notes = "Amount of soldiers present")
    private int soldierTotal;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public int getArmyTotal() {
        return armyTotal;
    }

    public void setArmyTotal(final int armyTotal) {
        this.armyTotal = armyTotal;
    }

//    public List<Integer> getArmyIDs() {
//        return armyIDs;
//    }
//
//    public void setArmyIDs(final List<Integer> armyIDs) {
//        this.armyIDs = armyIDs;
//    }

    public int getSoldierTotal() {
        return soldierTotal;
    }

    public void setSoldierTotal(final int soldierTotal) {
        this.soldierTotal = soldierTotal;
    }
}