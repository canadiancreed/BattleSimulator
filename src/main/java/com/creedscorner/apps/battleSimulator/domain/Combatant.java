package com.creedscorner.apps.battleSimulator.domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Structure of a combatant
 *
 * 1 - Personal information
 * 2 - Basic stats
 * 3 - Class specific stats
 * 4 - Spells if applicable
 * 5 - Other
 */

@Entity
public class Combatant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "The database generated battle ID")
    private int id;

    @ApiModelProperty(notes = "Name of Combatant. If an NPC, a general name such as scout of knight. If player, the players full name")
    private String name;

    @ApiModelProperty(notes = "Combatant level")
    private int level;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(final int level) {
        this.level = level;
    }
}
