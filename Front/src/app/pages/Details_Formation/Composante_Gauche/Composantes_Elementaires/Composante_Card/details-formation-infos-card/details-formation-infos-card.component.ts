import { Component, Input, OnInit} from '@angular/core';
import { max } from 'rxjs';
import Formation from 'src/app/models/formation.model';



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
   formation!: Formation;

   @Input()
   boutonNom!: string;

  constructor() { }


  ngOnInit(): void {
  }




  /**
   * Méthode pour split le texte en plusieurs lignes selon le séparateur //
   * @param text : le texte à split en plusieurs lignes
   * @returns : une liste de string (les lignes qui ont été splt)
   */
  textLines(text: string): string[]{
    return text.split("//");
  }
}
