import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import Utilisateur from 'src/app/models/utilisateur.model';
import { UtilisateurService } from 'src/app/services/utilisateur/utilisateur.service';

@Component({
  selector: 'app-interface-utilisateur',
  templateUrl: './interface-utilisateur.component.html',
  styleUrls: ['./interface-utilisateur.component.scss']
})
export class InterfaceUtilisateurComponent implements OnInit {

  /**
   * Attribut boolean isActive qui permet d'afficher ou de cacher les formations finis
   */
  isActive: boolean = false;

  id!: number;


  /**
   * Attribut utilisateur initialisé avec des valeurs vides
   */
  utilisateur: Utilisateur = {
    id: 1,
    nom: '',
    prenom: '',
    genre: '',
    adresse: '',
    email: '',
    telephone: '',
    isTest: false,
    noteMoyenne: 0,
    isTechnique: false,
    isPedagogique: false,
    isPrerequis: false,
    session: {
      id: 1,
      date: new Date(0,0,0),
      isIntra: false,
      lieu: '',
      formation: {
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
    }
  }


  constructor(private utilisateurService: UtilisateurService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    const id = this.route.params.subscribe((params) => {
      this.id = params['id'];
      this.subscribeUtilisateur(this.id);
    });
  }

  /**
   * Méthode appelé par l'event (click) pour mettre le boolean isActive en true ou en false
   */
  onClick(){
    this.isActive = !this.isActive;
  }


  /**
   * Méthode subscribe pour récupérer les infos de l'utilisateur depuis la base de donnée
   */
   private subscribeUtilisateur(id: number) {
    this.utilisateurService.getUtilisateur(id).subscribe((data) => {
      this.utilisateur = data;
    });
  }

}
