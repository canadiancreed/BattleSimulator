import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Army } from '../model/army';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class ArmyService {

  private armysUrl: string;

  constructor(private http: HttpClient) {
    this.armysUrl = 'http://localhost:8080/armys/list';
  }

  public findAll(): Observable<Army[]> {
    return this.http.get<Army[]>(this.armysUrl);
  }

  public save(user: Army) {
    return this.http.post<Army>(this.armysUrl, user);
  }
}
