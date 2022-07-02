import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import Theme from 'src/app/models/theme.model';

@Injectable({
  providedIn: 'root',
})
export class ThemeService {
  private apiUrl = 'http://localhost:3000';

  constructor(private httpClient: HttpClient) {}

  // On creer une methode pour recuperer les themes
  // La methode doit retourner un observable qui sera un tableau de themes
  getThemes(): Observable<Theme[]> {
    return this.httpClient.get<Theme[]>(`${this.apiUrl}/Themes`);
  }
}
