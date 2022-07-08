import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import SousTheme from 'src/app/models/sousTheme.models';
@Injectable({
  providedIn: 'root',
})
export class SousThemeService {
  private apiUrl = 'http://localhost:3000';

  sousTheme = [];
  sousThemes: any = {};

  constructor(private httpClient: HttpClient) {
    if (this.sousTheme.length > 0) {
      this.sousTheme = this.sousThemes;
    }
  }

  getSousThemes(): Observable<SousTheme[]> {
    return this.httpClient.get<SousTheme[]>(`${this.apiUrl}/sousThemes`);
  }
  getSousTheme(id: number): Observable<SousTheme> {
    return this.httpClient.get<SousTheme>(`${this.apiUrl}/sousThemes/${id}`);
  }
}
