import { Component, OnInit } from '@angular/core';

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
    submit : 'Inscription'
  },
  {
    nom : 'Intra',
    isFocus : false,
    text : 'Texte 2',
    submit : 'Inscription'
  },
  {
    nom : 'Personnalisée',
    isFocus : false,
    text : 'Texte 3',
    submit : 'Demander un devis'
  }
]

  constructor() { }

  ngOnInit(): void {
  }

}
