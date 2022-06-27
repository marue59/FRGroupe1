import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-details-formation-infos-bouton',
  templateUrl: './details-formation-infos-bouton.component.html',
  styleUrls: ['./details-formation-infos-bouton.component.scss']
})
export class DetailsFormationInfosBoutonComponent implements OnInit {

  /**
   * text: Le nom du bouton
   */
   @Input()
   text!: string;

   /**
    * isFocus: boolean qui sera en true ou false selon si le bouton est en focus (click)
    */
   @Input()
   isFocus!: boolean;


 /**
  * isHover : boolean qui sera en true ou false selon si le bouton est en hover (passage de souris sans click)
  */
   @Input()
   isHover!: boolean;

   /**
    * isLeave : boolean qui sera en true ou false selon si le bouton est en leave (la souris qui sort du cadre du bouton)
    */
   @Input()
   isLeave!: boolean;


 /**
  * 3 EventsEmitter pour le click, hover et le leave
  */
   @Output()
   public onClick : EventEmitter<any> = new EventEmitter;

   @Output()
   public onHover : EventEmitter<any> = new EventEmitter;

   @Output()
   public onLeave : EventEmitter<any> = new EventEmitter;




  constructor() { }

  ngOnInit(): void {
  }

  /**
   * Méthode pour appliquer un style à la couleur du bouton
   * @returns styles : le style background voulu selon la valeur de isFocus
   */
buttonFocus(): any{
  let styles = {
    'background': this.isFocus ? '#25a197' : 'white'
  }
  return styles;
  // this.render.setStyle(this.bouton.nativeElement,'width','500px');
}


/**
 * Méthode pour appliquer un style au texte du bouton
 * @returns styles : le style du texte du bouton (nom du bouton) selon la valeur de isFocus
 */
textFocus(): any{
  let styles = {
    'color': this.isFocus ? 'white' : '#228b22'
  }
  return styles;
}


/**
 * Méthode pour appliquer un style au background du bouton
 * @returns styles : le style du background du bouton selon la valeur de isHover
 */
buttonHover(){
  let styles = {
    'background': this.isHover? '#cbf5f5' : 'white'
  }
  return styles;
}


/**
 * Méthode pour reset le style à celui d'avant après que la souris n'est plus en hover
 * @returns styles : le style du background du bouton selon la valeur de isLeave
 */
buttonLeave(){
  let styles = {
    'background': this.isLeave? 'white' : '#cbf5f5'
  }
  return styles;
}


/**
 * 3 Méthodes pour transmettre l'eventEmitter à la composante parent
 */
clicked(){
  this.onClick.emit(1);
}

hover(){
  this.onHover.emit(1);
}

leave(){
  this.onLeave.emit(1);
}

}
