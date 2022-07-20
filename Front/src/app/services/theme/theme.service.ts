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

  theme = [];
  themes: any = [];
  // partager le résultat de la requete aux enfants
  private themesSource = new BehaviorSubject(this.themes);
  currentTheme = this.themesSource.asObservable();

  constructor(private httpClient: HttpClient) {}

  getThemes() {
    this.httpClient
      .get<Theme[]>(`${this.apiUrl}/themes`)
      .subscribe((themes) => {
        this.themesSource.next(themes);
      });
  }

  getTheme(id: number): Observable<Theme> {
    return this.httpClient.get<Theme>(`${this.apiUrl}/themes/${id}`);
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
