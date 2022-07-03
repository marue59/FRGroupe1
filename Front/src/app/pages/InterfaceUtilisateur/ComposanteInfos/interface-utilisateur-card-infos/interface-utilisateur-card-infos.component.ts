import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-interface-utilisateur-card-infos',
  templateUrl: './interface-utilisateur-card-infos.component.html',
  styleUrls: ['./interface-utilisateur-card-infos.component.scss']
})
export class InterfaceUtilisateurCardInfosComponent implements OnInit {

  /**
   * Les informations personnelles de l'utilisateur qui seront récupérés de la bdd
   * contiendra : le nom, le prénom, l'email et le numéro de téléphone
   */
   @Input()
   utilisateur!: any;

  constructor() { }

  ngOnInit(): void {
  }

}
