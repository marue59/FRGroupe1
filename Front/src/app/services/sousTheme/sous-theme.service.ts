import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import SousTheme from 'src/app/models/sousTheme.models';
@Injectable({
  providedIn: 'root',
})
export class SousThemeService {
  private apiUrl = 'http://localhost:3000';

  constructor(private httpClient: HttpClient) {}

  getSousThemes(): Observable<SousTheme[]> {
    return this.httpClient.get<SousTheme[]>(`${this.apiUrl}/sousThemes`);
  }
}
