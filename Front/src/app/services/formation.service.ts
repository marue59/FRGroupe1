import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import Formation from '../models/formation.model';

@Injectable({
  providedIn: 'root',
})
export class FormationService {
  private apiUrl = 'http://localhost:8080';

  constructor(private httpClient: HttpClient) {}

  getFormations(): Observable<Formation[]> {
    return this.httpClient.get<Formation[]>(`${this.apiUrl}/formations`);
  }

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
      `${this.apiUrl}/${formation.id}`,
      formation
    );
  }

  deleteFormation(id: number): Observable<Formation> {
    return this.httpClient.delete<Formation>(`${this.apiUrl}/formations/${id}`);
  }
}
