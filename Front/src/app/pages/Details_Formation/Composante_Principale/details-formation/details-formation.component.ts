import { getLocaleDateFormat } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Route, Router } from '@angular/router';
import Formation from 'src/app/models/formation.model';
import Session from 'src/app/models/session.model';
import { FormationService } from 'src/app/services/formation.service';
import { SessionService } from 'src/app/services/session/session.service';

@Component({
  selector: 'app-details-formation',
  templateUrl: './details-formation.component.html',
  styleUrls: ['./details-formation.component.scss'],
})
export class DetailsFormationComponent implements OnInit {

  formation: Formation = {
    id: 1,
    nom: '',
    description: '',
    prix: 0,
    isPersonnalise: false,
    objectifs: '',
    programme: '',
    heures: 0,
    jours: 0
  }
  id!: number;

  session: Session = {
    id: 1,
    date: new Date(0,0,0),
    isIntra: false,
    lieu: '',
  }

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private formationService: FormationService,
    private sessionService: SessionService
  ) {}

  ngOnInit(): void {
    const id = this.route.params.subscribe((params) => {
      this.id = params['id'];
      this.subscribeFormations(this.id);
      this.subscribeSession(this.id);
    });
  }

  private subscribeFormations(id: number) {
    this.formationService.getFormation(id).subscribe((formation) => {
      this.formation = formation;
    });
  }

  private subscribeSession(id: number){
    this.sessionService.getSession(id).subscribe((data) => {
      this.session = data;
    })
  }

  // private setSubscribe(id: string | null) {
  //   if (id) {
  //     this.subscribeFormations(+id);
  //     this.subscribeSession(+id);
  //   }
  // }
}
