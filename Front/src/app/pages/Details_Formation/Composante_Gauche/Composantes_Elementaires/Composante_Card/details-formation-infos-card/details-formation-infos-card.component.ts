import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-details-formation-infos-card',
  templateUrl: './details-formation-infos-card.component.html',
  styleUrls: ['./details-formation-infos-card.component.scss']
})
export class DetailsFormationInfosCardComponent implements OnInit {

  /**
   * Le texte des infos sur la formation qu'on récupérera de la composante parent à celle-ci
   */
   @Input()
   text!: string;

  constructor() { }

  ngOnInit(): void {
  }

}
