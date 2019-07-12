import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Battle } from '../model/battle';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class BattleService {

  private battlesListUrl: string;
  private battlesSaveUrl: string;

  constructor(private http: HttpClient) {
    this.battlesListUrl = 'http://localhost:8080/battles/list';
    this.battlesSaveUrl = 'http://localhost:8080/battles/add';
  }

  public findAll(): Observable<Battle[]> {
    return this.http.get<Battle[]>(this.battlesListUrl);
  }

  public save(battle: Battle) {
    return this.http.post<Battle>(this.battlesSaveUrl, battle);
  }

  public delete(battle: Battle) {
    return this.http.post<Battle>(this.battlesSaveUrl, battle);
  }
}
