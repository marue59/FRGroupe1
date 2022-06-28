import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-details-formation-inter-intra-inscription',
  templateUrl: './details-formation-inter-intra-inscription.component.html',
  styleUrls: ['./details-formation-inter-intra-inscription.component.scss']
})
export class DetailsFormationInterIntraInscriptionComponent implements OnInit {

  /**
   * Le nom du bouton : Inter/Intra/Personnalisé
   */
   @Input()
   boutonNom!: string;

  constructor() { }

  ngOnInit(): void {
  }

}
