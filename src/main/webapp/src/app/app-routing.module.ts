import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BattleListComponent } from './battle-list/battle-list.component';
import { BattleFormComponent } from './battle-form/battle-form.component';
import { ArmyFormComponent } from './army-form/army-form.component';
import { CombatantFormComponent } from './combatant-form/combatant-form.component';

const routes: Routes = [
  { path: 'battles', component: BattleListComponent },
  { path: 'addbattle', component: BattleFormComponent },
  { path: 'addarmy', component: ArmyFormComponent },
  { path: 'addcombatant', component: CombatantFormComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
