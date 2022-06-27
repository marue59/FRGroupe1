import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-details-formation-infos-enfant',
  templateUrl: './details-formation-infos-enfant.component.html',
  styleUrls: ['./details-formation-infos-enfant.component.scss']
})
export class DetailsFormationInfosEnfantComponent implements OnInit {

  /**
   * La liste des boutons qui sera récupérée de la composante parent
   */
@Input()
boutons!: any;

  constructor() { }

  ngOnInit(): void {
  }

  /**
 * Méthode changeFocus pour changer le boolean isFocus en true/fale selon le bouton où le focus est mis
 * le focus des autres boutons est mis en false
 * @param index : le bouton en cours de focus
 */
   changeFocus(index: number){
    for(let num =0; num < this.boutons.length; num++){
      if(num == index){
        this.boutons[num].isFocus = true;
        this.boutons[num].isHover = false; // Hover en false pour que le focus ne s'entrelace pas avec le style émis avec le hover (le passage de souris)
      } else{
        this.boutons[num].isFocus = false;
      }
  }
}

/**
 * Méthode changeHover pour changer le boolean isHover en true/false selon le bouton où le hover est mis
 * @param index : le bouton en cours de hover (passage de souris)
 */
changeHover(index: number){
  for(let num =0; num < this.boutons.length; num++){
    if(num == index && !this.boutons[index].isFocus){
      this.boutons[num].isHover = true;
    } else{
      this.boutons[num].isHover = false;
    }
}
}

/**
 * Méthode changeLeave pour enlever le style généré par le hover une fois qu'on enleve la souris du bouton
 */
changeLeave(){
  for(let num =0; num < this.boutons.length; num++){
    this.boutons[num].isHover = false;
  }
}

}
