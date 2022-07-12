import { Component, Input, OnInit } from '@angular/core';
import Formation from 'src/app/models/formation.model';
import Session from 'src/app/models/session.model';

@Component({
  selector: 'app-details-formation-inter-intra-parent',
  templateUrl: './details-formation-inter-intra-parent.component.html',
  styleUrls: ['./details-formation-inter-intra-parent.component.scss']
})
export class DetailsFormationInterIntraParentComponent implements OnInit {

  /**
 * Les données de la bordure grise contenant :
 * nom: le nom des boutons
 * isFocus: un booolean isFocus pour tenir compte si le bouton a été cliqué par l'utilisateur ou non
 * text: le texte appraissant en dessous des 3 onglets Inter/Intra/Peronnaliée et contenant la date et le lieu de la prochaine session
 * submit: le nom du bouton qui permet de se redirigé vers la page formulaire d'inscription
 * (ces données seront remplacées plus tard par le service qui permettra de piocher dans la bdd)
 */
   boutons: any = [{
    nom : 'Inter',
    isFocus : true,
    text : 'Texte 1',
    submit : 'Inscription',
    heure : 'Texte 1',
    lieu : 'Texte 1',
    prix: 'Texte 1',
    date: 'Texte 1'
  },
  {
    nom : 'Intra',
    isFocus : false,
    text : 'Texte 2',
    submit : 'Inscription',
    heure : 'Texte 2',
    lieu : 'Texte 2',
    prix: 'Texte 2',
    date: 'Texte 2'
  },
  {
    nom : 'Personnalisée',
    isFocus : false,
    text : 'Texte 3',
    submit : 'Demander un devis',
    heure : 'Texte 3',
    lieu : 'Texte 3',
    prix: 'Texte 3',
    date: 'Texte 3'
  }
]

@Input()
formation!: Formation;

@Input()
session!: Session;

  constructor() { }

  ngOnInit(): void {
  }

}
