import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-interface-utilisateur-card-infos',
  templateUrl: './interface-utilisateur-card-infos.component.html',
  styleUrls: ['./interface-utilisateur-card-infos.component.scss']
})
export class InterfaceUtilisateurCardInfosComponent implements OnInit {

  /**
   * Le texte des infos sur la formation qu'on récupérera de la composante parent à celle-ci
   */
   @Input()
   infos!: any;

  constructor() { }

  ngOnInit(): void {
  }

}
