import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import Formations from '../models/formations.model';


@Injectable({
  providedIn: 'root'
})
export class FormationsService {

  private apiUrl = 'http://localhost:8080';

  constructor(private httpClient: HttpClient) { }

  getFormations(): Observable<Formations[]>{
    return this.httpClient.get<Formations[]>(`${this.apiUrl}/formations`);
  }

  getFormation(id: number): Observable<Formations>{
    return this.httpClient.get<Formations>(`${this.apiUrl}/formations/${id}`);
  }




}
