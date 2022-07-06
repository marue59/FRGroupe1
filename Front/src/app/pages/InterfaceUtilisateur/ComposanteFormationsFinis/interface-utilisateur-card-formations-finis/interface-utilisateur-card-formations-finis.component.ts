import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-interface-utilisateur-card-formations-finis',
  templateUrl: './interface-utilisateur-card-formations-finis.component.html',
  styleUrls: ['./interface-utilisateur-card-formations-finis.component.scss']
})
export class InterfaceUtilisateurCardFormationsFinisComponent implements OnInit {

  /**
   * Attribut session, contenant :
   * une date
   * un prix
   * un boolean : isIntra
   */
  session!: any;

  constructor() { }

  ngOnInit(): void {
  }

}
