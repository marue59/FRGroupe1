import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs';

// import du Model
import Formation from 'src/app/models/formation.model';
// import du Service
import { FormationService } from 'src/app/services/formation.service';

@Component({
  selector: 'app-formation-card',
  templateUrl: './formation-card.component.html',
  styleUrls: ['./formation-card.component.scss'],
})
export class FormationCardComponent implements OnInit {
  // @Input() formations: any;
  formation: any;
  formations: Formation[] = [];
  subscription!: Subscription;

  constructor(
    private formationService: FormationService,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.subscription = this.formationService.currentFormation.subscribe(
      (formation) => {
        this.formation = formation;
      }
    );
  }
  private subscribeFormation(id: number) {
    this.formationService.getFormation(id).subscribe((formation) => {
      this.formation = formation;
    });
  }

  private setSubscribe(id: string | null) {
    if (id) {
      this.subscribeFormation(+id);
    }
  }
}
