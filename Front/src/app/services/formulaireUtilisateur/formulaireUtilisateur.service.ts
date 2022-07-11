import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import FormulaireUtilisateur from 'src/app/models/formulaireUtilisateur.model';


@Injectable({
  providedIn: 'root',
})
export class FormulaireUtilisateurService {
  private apiUrl = 'http://localhost:8080';

  constructor(private httpClient: HttpClient) {}

getFormulaire(): Observable<FormulaireUtilisateur[]>{
  return this.httpClient.get<FormulaireUtilisateur[]>(`${this.apiUrl}/formulaire-inscription`);
}

/*getFormation(id: number): Observable<FormulaireUtilisateur>{
  return this.httpClient.get<FormulaireUtilisateur>(`${this.apiUrl}/formulaireutilisateur/${id}`);
}*/

createFormulaire(formulaire: FormulaireUtilisateur): Observable<FormulaireUtilisateur>{
  return this.httpClient.post<FormulaireUtilisateur>(`${this.apiUrl}/formulaire-inscription`, formulaire);
}

/*updateFormulaire(formulaire: FormulaireUtilisateur): Observable<FormulaireUtilisateur>{
  return this.httpClient.put<FormulaireUtilisateur>(`${this.apiUrl}/${formation.id}`,formation);
}*/

deleteFormulaire(id: number): Observable<FormulaireUtilisateur>{
  return this.httpClient.delete<FormulaireUtilisateur>(`${this.apiUrl}/formulaire-inscription/${id}`);
}
}
