import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-interface-utilisateur-card-formation-en-cours',
  templateUrl: './interface-utilisateur-card-formation-en-cours.component.html',
  styleUrls: ['./interface-utilisateur-card-formation-en-cours.component.scss']
})
export class InterfaceUtilisateurCardFormationEnCoursComponent implements OnInit {


  /**
   * Attribut de la session en cours, contenant :
   * une date
   * un prix
   * un boolean : isIntra
   */
  session!: any;

  constructor() { }

  ngOnInit(): void {
  }

}
