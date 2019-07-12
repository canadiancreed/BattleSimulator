import { Component, OnInit } from '@angular/core';
import { Battle } from '../model/battle';
import { BattleService } from '../service/battle.service';

@Component({
  selector: 'app-battle-list',
  templateUrl: './battle-list.component.html',
  styleUrls: ['./battle-list.component.css']
})

export class BattleListComponent implements OnInit {

  battles: Battle[];

  constructor(private battleService: BattleService) {
  }

  ngOnInit() {
    this.battleService.findAll().subscribe(data => {
      this.battles = data;
    });
  }
}
