import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Route, Router } from '@angular/router';
import Formations from 'src/app/models/formations.model';
import { FormationsService } from 'src/app/services/formations.service';

@Component({
  selector: 'app-details-formation',
  templateUrl: './details-formation.component.html',
  styleUrls: ['./details-formation.component.scss'],
  providers: [FormationsService]
})
export class DetailsFormationComponent implements OnInit {

  /**
   * Le titre de la formation
   * (qui sera remplacé plus tard par une composante service pour le piocher dans la bdd)
   */
   formation!: Formations;

  constructor( private router: Router, private route: ActivatedRoute, private formationsService: FormationsService) { }

  ngOnInit(): void {

    const id = this.route.snapshot.paramMap.get('id');

    this.setSubscribe(id);

  }

  private subscribeFormations(id: number){
    this.formationsService.getFormation(id).subscribe((formation) => {
      this.formation = formation;
    })
  }

  private setSubscribe(id: string | null){
    if(id){
      this.subscribeFormations(+id);
    }
  }

}
