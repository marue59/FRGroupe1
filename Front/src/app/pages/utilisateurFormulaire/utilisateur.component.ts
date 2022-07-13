import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Utilisateur } from 'src/app/models/utilisateur.model';
import { UtilisateurService } from 'src/app/services/utilisateur/utilisateur.service';

@Component({
  selector: 'app-utilisateur',
  templateUrl: './utilisateur.component.html',
  styleUrls: ['./utilisateur.component.scss']
})
export class UtilisateurComponent implements OnInit {

public utilisateur: Utilisateur = new Utilisateur();

  constructor(private utilisateurService: UtilisateurService,
    private router: Router)
     { }

  ngOnInit(): void {
  }

public saveData(utilisateurFormulaire:NgForm){
  console.log("hello");
  console.log(utilisateurFormulaire.form);
  console.log('valeurs: ', JSON.stringify(utilisateurFormulaire.value))
}


public addUtilisateur(utilisateurFormulaire:NgForm){
  this.utilisateurService.createUtilisateur(utilisateurFormulaire.value).subscribe({
    next : () => {
      this.router.navigate(["/home"])
    }
  })
}

}
