import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-details-formation',
  templateUrl: './details-formation.component.html',
  styleUrls: ['./details-formation.component.scss']
})
export class DetailsFormationComponent implements OnInit {

  /**
   * Le titre de la formation
   * (qui sera remplacé plus tard par une composante service pour le piocher dans la bdd)
   */
   titreFormation: string = 'Formation développeur Java';

  constructor() { }

  ngOnInit(): void {
  }

}
