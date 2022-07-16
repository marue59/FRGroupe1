import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';

// import du Model
import Formation from '../models/formation.model';

@Injectable({
  providedIn: 'root',
})
export class FormationService {
  // declarer l'url pour le back
  private apiUrl = 'http://localhost:8080';

  // Permet d'envoyer quelque chose ('resultat' de la requete) a quelqu'un d'autre
  private formationSource = new BehaviorSubject(null);
  currentFormation = this.formationSource.asObservable();

  // Permet au dropdown de partager la recherche
  private dropdownSource = new BehaviorSubject('');
  currentDropdown = this.dropdownSource.asObservable();

  constructor(private httpClient: HttpClient) {}

  getFormations(): Observable<Formation[]> {
    return this.httpClient.get<Formation[]>(`${this.apiUrl}/formations`);
  }

  getFormation(id: number): Observable<Formation> {
    return this.httpClient.get<Formation>(`${this.apiUrl}/formations/${id}`);
  }

  /*getFormationById(id: number) {
    this.httpClient
      .get<Formation>(`${this.apiUrl}/formations/${id}`)
      .subscribe((resultat: any) => {
        this.formationSource.next(resultat);
      });
  }
*/
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

  // Fonction qui permet au dropdown de partager la recherche
  shareFormations(value: string) {
    this.dropdownSource.next(value);
  }
}
