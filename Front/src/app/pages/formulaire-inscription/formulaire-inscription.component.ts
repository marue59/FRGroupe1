import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { FormBuilder } from '@angular/forms';
import { Validators } from '@angular/forms';
import FormulaireUtilisateur from 'src/app/models/formulaireUtilisateur.model';
import { FormulaireUtilisateurService } from 'src/app/services/formulaireUtilisateur/formulaireUtilisateur.service';


@Component({
  selector: 'app-formulaire-inscription',
  templateUrl: './formulaire-inscription.component.html',
  styleUrls: ['./formulaire-inscription.component.scss']
})
export class FormulaireInscriptionComponent implements OnInit {

 detailUtilisateurForm!: FormGroup;
  us!:FormulaireUtilisateurService;


  constructor(private formbuild : FormBuilder) {
  }  

  ngOnInit(): void {  
       this.createForms();
  }

createForms(){
  this.detailUtilisateurForm = this.formbuild.group({
    nom: ['', Validators.required],
    prenom: ['', Validators.required],
    genre:['', Validators.required],
    email: ['', Validators.required],
    numTel:['', Validators.required],
    lieu:[''],
    date:[''],
    addresse:['', Validators.required]
})}


  onSubmit() {

  }
}
