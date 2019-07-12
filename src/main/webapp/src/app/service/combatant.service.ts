import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Combatant } from '../model/combatant';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class CombatantService {

  private combatantsUrl: string;

  constructor(private http: HttpClient) {
    this.combatantsUrl = 'http://localhost:8080/combatants/list';
  }

  public findAll(): Observable<Combatant[]> {
    return this.http.get<Combatant[]>(this.combatantsUrl);
  }

  public save(user: Combatant) {
    return this.http.post<Combatant>(this.combatantsUrl, user);
  }
}
