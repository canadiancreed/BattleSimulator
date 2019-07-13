import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Army } from '../model/army';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class ArmyService {

    private readonly armiesListUrl: string;
    private readonly armiesSaveUrl: string;

    constructor(private http: HttpClient) {
        this.armiesListUrl = 'http://localhost:8080/armies/list';
        this.armiesSaveUrl = 'http://localhost:8080/armies/add';
    }

  public findAll(): Observable<Army[]> {
    return this.http.get<Army[]>(this.armiesListUrl);
  }

  public save(army: Army) {
    return this.http.post(this.armiesSaveUrl, army, {responseType: 'text'});
  }
}
