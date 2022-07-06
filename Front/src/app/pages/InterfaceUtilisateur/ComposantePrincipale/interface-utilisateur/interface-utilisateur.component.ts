import { Component, OnInit } from '@angular/core';

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

  constructor() { }

  ngOnInit(): void {
  }

  /**
   * Méthode appelé par l'event (click) pour mettre le boolean isActive en true ou en false
   */
  onClick(){
    this.isActive = !this.isActive;
  }



}
