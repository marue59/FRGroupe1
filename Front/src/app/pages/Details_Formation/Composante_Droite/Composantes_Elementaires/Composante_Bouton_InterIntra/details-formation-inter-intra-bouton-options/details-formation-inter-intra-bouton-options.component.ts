import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-details-formation-inter-intra-bouton-options',
  templateUrl: './details-formation-inter-intra-bouton-options.component.html',
  styleUrls: ['./details-formation-inter-intra-bouton-options.component.scss']
})
export class DetailsFormationInterIntraBoutonOptionsComponent implements OnInit {

  /**
  * Nom du bouton
  */
   @Input()
   text!: string;

   /**
    * Boolean isFocus pour mettre le bouton en focus ou non selon si l'utilisateur a cliqué sur le bouton
    */
   @Input()
   isFocus!: boolean;


 /**
  * Event emitter pour remonter l'information vers le parent
  *
  */
   @Output()
   public onClick : EventEmitter<any> = new EventEmitter();

  constructor() { }

  ngOnInit(): void {
  }

  /**
   * Méthode clicked pour remonter l'information vers le parent
   */
   clicked(){
    this.onClick.emit(1);
  }


  /**
   * Méthode pour changer le style background du bouton en cas de click (i.e: si le boolean isFocus est en true)
   * @returns le style du background
   */
  buttonFocus(){
  let styles = {
  'background' : this.isFocus? '#25a197' : 'white'
}
return styles;
  }


  /**
   * Méthode pour changer le style du texte se trouvant dans le bouton en cas de click (i.e: si le bouton isFocus est en true)
   * @returns le style du texte
   */
  textFocus(){
  let styles = {
    'color': this.isFocus? 'white' : 'black'
  }
  return styles;
  }

}
