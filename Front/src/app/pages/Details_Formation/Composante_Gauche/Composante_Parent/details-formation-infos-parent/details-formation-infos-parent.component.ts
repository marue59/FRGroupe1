import { Component, Input, OnInit } from '@angular/core';
import Formation from 'src/app/models/formation.model';

@Component({
  selector: 'app-details-formation-infos-parent',
  templateUrl: './details-formation-infos-parent.component.html',
  styleUrls: ['./details-formation-infos-parent.component.scss']
})
export class DetailsFormationInfosParentComponent implements OnInit {

  /**
 * La liste des 4 boutons des onglets de la page 'infos sur la formation', où chacun des boutons contient :
 * nom : le nom du bouton
 * isFocus : boolean pour tenir compte du focus (click) de l'utilisateur sur le bouton
 * text : le texte en dessous de l'onglet des 4 boutons contenant les informations
 * isHover : boolean pour tenir compte de hover (passage de souris sans click) de l'utilisateur sur le bouton
 */
   boutons:any = [
    {
      nom : "Présentation",
      isFocus : true,
      text : "Texte 1",
      isHover : false
    },
    {
      nom : "Objectifs",
      isFocus: false,
      text : "Texte 2",
      isHover : false
    },
    {
      nom : "Programme",
      isFocus : false,
      text : "Texte 3",
      isHover : false
    },
    {
      nom : "Contact",
      isFocus : false,
      text : "Texte 4",
      isHover : false
    }
  ]

  @Input()
  formation!: Formation;

  constructor() { }

  ngOnInit(): void {
  }

}
