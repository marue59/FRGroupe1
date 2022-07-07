import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';

import Theme from 'src/app/models/theme.model';

@Injectable({
  providedIn: 'root',
})
export class ThemeService {
  private apiUrl = 'http://localhost:3000';

  private themeSource = new BehaviorSubject(null);
  currentTheme = this.themeSource.asObservable();

  constructor(private httpClient: HttpClient) {
    this.httpClient.get(`${this.apiUrl}/themes`).subscribe((theme: any) => {
      this.themeSource.next(theme);
    });
  }
}
