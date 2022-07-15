import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import Utilisateur from 'src/app/models/utilisateur.model';


@Injectable({
  providedIn: 'root'
})
export class UtilisateurService {

  private apiUrl = 'http://localhost:8080';

  constructor(private httpClient: HttpClient) { }

  /*getUtilisateur(): Observable<Utilisateur[]>{
    return this.httpClient.get<Utilisateur[]>(`${this.apiUrl}/formations`);
  }
  
  getUtilisateur(id: number): Observable<Utilisateur>{
    return this.httpClient.get<Utilisateur>(`${this.apiUrl}/formations/${id}`);
  }*/

  createUtilisateur(utilisateur: Utilisateur): Observable<Utilisateur> {
    return this.httpClient.post<Utilisateur>(`${this.apiUrl}/utilisateurs`, utilisateur);
  }

  /*
  updateUtilisateur(utilisateur: Utilisateur): Observable<Utilisateur>{
    return this.httpClient.put<Utilisateur>(`${this.apiUrl}/${utilisateur.id}`,utilisateur);
  }*/

  /*
  deleteUtilisateur(id: number): Observable<Utilisateur> {
    return this.httpClient.delete<Utilisateur>(`${this.apiUrl}/utilisateur/${id}`);
  }*/
}
