import { Component, Input, OnInit } from '@angular/core';
import Utilisateur from 'src/app/models/utilisateur.model';

@Component({
  selector: 'app-interface-utilisateur-card-formation-en-cours',
  templateUrl: './interface-utilisateur-card-formation-en-cours.component.html',
  styleUrls: ['./interface-utilisateur-card-formation-en-cours.component.scss']
})
export class InterfaceUtilisateurCardFormationEnCoursComponent implements OnInit {



  @Input()
  utilisateur!: Utilisateur;

  constructor() { }

  ngOnInit(): void {
  }

}
