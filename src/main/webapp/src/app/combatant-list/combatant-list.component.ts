import { Component, OnInit } from '@angular/core';
import {Combatant} from "../model/combatant";
import {CombatantService} from "../service/combatant.service";

@Component({
  selector: 'app-combatant-list',
  templateUrl: './combatant-list.component.html',
  styleUrls: ['./combatant-list.component.css']
})

export class CombatantListComponent implements OnInit {

  combatants: Combatant[];

  constructor(private combatantService: CombatantService) {
  }

  ngOnInit() {
    this.combatantService.findAll().subscribe(data => {
      this.combatants = data;
    });
  }
}