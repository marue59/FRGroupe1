import { Component, Input, OnInit } from '@angular/core';
import Formation from 'src/app/models/formation.model';
import Session from 'src/app/models/session.model';

@Component({
  selector: 'app-details-formation-inter-intra-enfant',
  templateUrl: './details-formation-inter-intra-enfant.component.html',
  styleUrls: ['./details-formation-inter-intra-enfant.component.scss']
})
export class DetailsFormationInterIntraEnfantComponent implements OnInit {

  /**
   * La liste des boutons avec leurs informations qu'on récupère de la composante parent
   */
   @Input()
   boutons!: any;

   @Input()
   formation!: Formation;

   @Input()
   session!: Session;

  constructor() { }

  ngOnInit(): void {
  }

  /**
 * Méthode changeFocus qui permet de change le focus du click et de le garder en focus même quand la souris click ailleurs que sur ces 3 boutons
 * @param index : le bouton Inter/Intra/Personnalisé que l'utilisateur a cliqué dessus
 */
   changeFocus(index : number){
    for(let num=0; num < this.boutons.length; num++){
      if(num == index){
        this.boutons[num].isFocus = true;
      } else{
        this.boutons[num].isFocus = false;
      }
    }
  }

}
