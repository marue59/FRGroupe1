import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { FormBuilder } from '@angular/forms';
import { Validators } from '@angular/forms';


@Component({
  selector: 'app-formulaire-inscription',
  templateUrl: './formulaire-inscription.component.html',
  styleUrls: ['./formulaire-inscription.component.scss']
})
export class FormulaireInscriptionComponent implements OnInit {

  detailUtilisateurForm: FormGroup;

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
    addresse: this.formbuild.group({
      rue: [''],
      ville: [''],
      pays: ['']
    })
})}
  
  onSubmit() {
  }
}
