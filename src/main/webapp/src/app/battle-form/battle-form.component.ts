import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BattleService } from '../service/battle.service';
import { Battle } from '../model/battle';

@Component({
  selector: 'app-battle-form',
  templateUrl: './battle-form.component.html',
  styleUrls: ['./battle-form.component.css']
})
export class BattleFormComponent {

  battle: Battle;

  constructor(private route: ActivatedRoute, private router: Router, private battleService: BattleService) {
    this.battle = new Battle();
  }

  onSubmit() {
    this.battleService.save(this.battle).subscribe(result => this.gotoBattleList());
  }

  gotoBattleList() {
    this.router.navigate(['/battles']);
  }
}
