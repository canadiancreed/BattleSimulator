import { Component, OnInit } from '@angular/core';
import {Army} from "../model/army";
import {ArmyService} from "../service/army.service";

@Component({
  selector: 'app-army-list',
  templateUrl: './army-list.component.html',
  styleUrls: ['./army-list.component.css']
})

export class ArmyListComponent implements OnInit {

  armies: Army[];

  constructor(private armyService: ArmyService) {
  }

  ngOnInit() {
    this.armyService.findAll().subscribe(data => {
      this.armies = data;
    });
  }
}
