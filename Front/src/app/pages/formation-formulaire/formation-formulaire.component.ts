import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import Formation from 'src/app/models/formation.model';
import { FormationService } from 'src/app/services/formation.service';

@Component({
  selector: 'app-formation-formulaire',
  templateUrl: './formation-formulaire.component.html',
  styleUrls: ['./formation-formulaire.component.scss']
})
export class FormationFormulaireComponent implements OnInit {

  formation: Formation = {
    id: 1,
    nom: '',
    description: '',
    prix: 0,
    isPersonnalise: false,
    heures: 0,
    jours: 0,
    objectifs: '',
    programme: '',
    image: ''
  }

  constructor(private formationService: FormationService,
    private router: Router) {

  }

  ngOnInit(): void {
  }

  public addFormation(formationFormulaire: NgForm) {
    this.formationService.createFormation(formationFormulaire.value).subscribe({
      next: () => {
        this.router.navigate(["/home"])
      }
    })
  }

}
