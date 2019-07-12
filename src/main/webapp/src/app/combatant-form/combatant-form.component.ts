import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CombatantService } from '../service/combatant.service';
import { Combatant } from '../model/combatant';

@Component({
  selector: 'app-combatant-form',
  templateUrl: './combatant-form.component.html',
  styleUrls: ['./combatant-form.component.css']
})
export class CombatantFormComponent {

  combatant: Combatant;

  constructor(private route: ActivatedRoute, private router: Router, private combatantService: CombatantService) {
    this.combatant = new Combatant();
  }

  onSubmit() {
    this.combatantService.save(this.combatant).subscribe(result => this.gotoCombatantList());
  }

  gotoCombatantList() {
    this.router.navigate(['/combatants']);
  }
}
