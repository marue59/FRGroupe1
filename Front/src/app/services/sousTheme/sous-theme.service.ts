import { Injectable, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';

import SousTheme from 'src/app/models/sousTheme.models';

@Injectable({
  providedIn: 'root',
})
export class SousThemeService {
  // declarer l'url pour le back
  private apiUrl = 'http://localhost:8080';

  sousTheme = [];
  sousThemes: any = {};

  // Permet d'envoyer quelque chose ('resultat' de la requete) a quelqu'un d'autre
  private sousThemeSource = new BehaviorSubject(null);
  currentSousTheme = this.sousThemeSource.asObservable();

  constructor(private httpClient: HttpClient) {
    if (this.sousTheme.length > 0) {
      this.sousTheme = this.sousThemes;
    }
  }

  getSousThemes(): Observable<SousTheme[]> {
    return this.httpClient.get<SousTheme[]>(`${this.apiUrl}/sous-themes`);
  }
  getSousTheme(id: number): Observable<SousTheme> {
    return this.httpClient.get<SousTheme>(`${this.apiUrl}/sous-themes/${id}`);
  }

  getSousThemeById(id: number) {
    // this.httpClient.get<SousTheme>(`${this.apiUrl}/sous-themes/${id}`);
    this.httpClient
      .get<SousTheme>(`${this.apiUrl}/sous-themes/${id}`)
      .subscribe((resultat: any) => {
        this.sousThemeSource.next(resultat);
      });
  }

  getSousThemeByIdObs(id: number) {
    // this.httpClient.get<SousTheme>(`${this.apiUrl}/sous-themes/${id}`);
    return this.httpClient.get<SousTheme>(`${this.apiUrl}/sous-themes/${id}`);
  }

  createSousTheme(sousTheme: SousTheme): Observable<SousTheme> {
    return this.httpClient.post<SousTheme>(
      `${this.apiUrl}/sous-themes`,
      sousTheme
    );
  }

  updateSousTheme(sousTheme: SousTheme): Observable<SousTheme> {
    return this.httpClient.put<SousTheme>(
      `${this.apiUrl}/${sousTheme.id}`,
      sousTheme
    );
  }

  deleteSousTheme(id: number): Observable<SousTheme> {
    return this.httpClient.delete<SousTheme>(
      `${this.apiUrl}/sous-themes/${id}`
    );
  }
}
