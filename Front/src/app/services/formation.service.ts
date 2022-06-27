import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import Formation from '../models/formation.model';

@Injectable({
  providedIn: 'root',
})
export class FormationService {
  private apiUrl = 'http://localhost:3000';

  constructor(private httpClient: HttpClient) {}

  // CRUD
  getFormations(): Observable<Formation[]> {
    return this.httpClient.get<Formation[]>(`${this.apiUrl}/formations`);
    // ou en plus simple
    // return this.httpClient.get<Film>(this.apiUrl + '/formation');
  }
  /*
  getFormation(id: number): Observable<Formation> {
    return this.httpClient.get<Formation>(`${this.apiUrl}/formations/${id}`);
  }

  createFormation(formation: Formation): Observable<Formation> {
    return this.httpClient.post<Formation>(
      `${this.apiUrl}/formations`,
      formation
    );
  }

  updateFormation(formation: Formation): Observable<Formation> {
    return this.httpClient.put<Formation>(
      `${this.apiUrl}/albums/${formation.id}`,
      formation
    );
  }*/
}
