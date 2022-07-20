import { Component, OnInit } from '@angular/core';
import Utilisateur from 'src/app/models/utilisateur.model';

@Component({
  selector: 'app-interface-utilisateur-card-formations-finis',
  templateUrl: './interface-utilisateur-card-formations-finis.component.html',
  styleUrls: ['./interface-utilisateur-card-formations-finis.component.scss']
})
export class InterfaceUtilisateurCardFormationsFinisComponent implements OnInit {


  utilisateur!: Utilisateur;

  constructor() { }

  ngOnInit(): void {
  }

}
