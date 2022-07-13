import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Route, Router } from '@angular/router';
import Formation from 'src/app/models/formation.model';
import { FormationService } from 'src/app/services/formation.service';

@Component({
  selector: 'app-details-formation',
  templateUrl: './details-formation.component.html',
  styleUrls: ['./details-formation.component.scss'],
})
export class DetailsFormationComponent implements OnInit {
  formation!: Formation;
  id!: number;

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private formationService: FormationService
  ) {}

  ngOnInit(): void {
    const id = this.route.params.subscribe((params) => {
      this.id = params['id'];
      this.subscribeFormations(this.id);
    });
  }

  private subscribeFormations(id: number) {
    this.formationService.getFormation(id).subscribe((formation) => {
      this.formation = formation;
    });
  }
}
