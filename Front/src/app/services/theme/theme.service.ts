import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';

import Theme from 'src/app/models/theme.model';

@Injectable({
  providedIn: 'root',
})
export class ThemeService {
  // declarer l'url pour le back
  private apiUrl = 'http://localhost:8080';

  Theme = [];
  Themes: any = {};

  // Permet d'envoyer quelque chose ('resultat' de la requete) a quelqu'un d'autre
  private themeSource = new BehaviorSubject(null);
  currentTheme = this.themeSource.asObservable();

  constructor(private httpClient: HttpClient) {
    this.httpClient.get(`${this.apiUrl}/themes`).subscribe((theme: any) => {
      this.themeSource.next(theme);
      if (this.Theme.length > 0) {
        this.Theme = this.Themes;
      }
    });
  }

  getThemes(): Observable<Theme[]> {
    return this.httpClient.get<Theme[]>(`${this.apiUrl}/themes`);
  }

  getTheme(id: number): Observable<Theme> {
    return this.httpClient.get<Theme>(`${this.apiUrl}/themes/${id}`);
  }

  getThemeById(id: number) {
    this.httpClient
      .get<Theme>(`${this.apiUrl}/themes/${id}`)
      .subscribe((resultat: any) => {
        this.themeSource.next(resultat);
      });
  }

  createTheme(theme: Theme): Observable<Theme> {
    return this.httpClient.post<Theme>(`${this.apiUrl}/themes`, theme);
  }

  updateTheme(theme: Theme): Observable<Theme> {
    return this.httpClient.put<Theme>(`${this.apiUrl}/${theme.id}`, theme);
  }

  deleteTheme(id: number): Observable<Theme> {
    return this.httpClient.delete<Theme>(`${this.apiUrl}/themes/${id}`);
  }
}
