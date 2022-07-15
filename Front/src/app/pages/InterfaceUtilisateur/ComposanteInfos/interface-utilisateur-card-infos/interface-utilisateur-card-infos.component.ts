import { Component, Input, OnInit } from '@angular/core';
import Utilisateur from 'src/app/models/utilisateur.model';

@Component({
  selector: 'app-interface-utilisateur-card-infos',
  templateUrl: './interface-utilisateur-card-infos.component.html',
  styleUrls: ['./interface-utilisateur-card-infos.component.scss']
})
export class InterfaceUtilisateurCardInfosComponent implements OnInit {

/**
 * L'utilisateur
 * qui a pour attributs : id, nom, prenom, tel, email, role, isTest
 */
   @Input()
   utilisateur!: Utilisateur;

  constructor() { }

  ngOnInit(): void {
  }

}
