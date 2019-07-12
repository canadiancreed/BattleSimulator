import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ArmyService } from '../service/army.service';
import { Army } from '../model/army';

@Component({
  selector: 'app-army-form',
  templateUrl: './army-form.component.html',
  styleUrls: ['./army-form.component.css']
})
export class ArmyFormComponent {

  army: Army;

  constructor(private route: ActivatedRoute, private router: Router, private armyService: ArmyService) {
    this.army = new Army();
  }

  onSubmit() {
    this.armyService.save(this.army).subscribe(result => this.gotoArmyList());
  }

  gotoArmyList() {
    this.router.navigate(['/armys']);
  }
}
