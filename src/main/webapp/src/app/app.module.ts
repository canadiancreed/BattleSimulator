import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { BattleListComponent } from './battle-list/battle-list.component';
import { BattleFormComponent } from './battle-form/battle-form.component';
import { BattleService } from './service/battle.service';
import { ArmyListComponent } from './army-list/army-list.component';
import { ArmyFormComponent } from './army-form/army-form.component';
import { ArmyService } from './service/army.service';
import { CombatantListComponent } from './combatant-list/combatant-list.component';
import { CombatantFormComponent } from './combatant-form/combatant-form.component';
import { CombatantService } from './service/combatant.service';

@NgModule({
  declarations: [
    AppComponent,
    BattleListComponent,
    BattleFormComponent,
    ArmyListComponent,
    ArmyFormComponent,
    CombatantListComponent,
    CombatantFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
    ArmyService,
    BattleService,
    CombatantService
  ],
  bootstrap: [AppComponent]
})

export class AppModule { }
