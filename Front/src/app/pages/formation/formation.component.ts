import { SlicePipe } from '@angular/common';
import { Component, Input, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { ActivatedRoute } from '@angular/router';

// import des Models
import Formation from 'src/app/models/formation.model';

// import des Services
import { FormationService } from 'src/app/services/formation.service';

@Component({
  selector: 'app-formation',
  templateUrl: './formation.component.html',
  styleUrls: ['./formation.component.scss'],
})
export class FormationComponent implements OnInit {
  formations: any = [];
  formationsCopy: Formation[] = [];
  subscription!: Subscription;

  constructor(
    private formationService: FormationService,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    // recuperer la liste de toute les formations
    this.route.paramMap.subscribe((params) => {
      if (params.get('value') && this.formations) {
        console.log('1');
        let value = params.get('value');
        this.formationsCopy = this.formations.filter((formationObject: any) => {
          return formationObject.nom
            .toLowerCase()
            .includes(value?.toLowerCase());
        });
      }
    });

    // recuperer la liste de toute les formations par le biais du services
    this.formationService.getFormations().subscribe((formations) => {
      this.formations = formations;
      this.formationsCopy = formations;
    });
  }
}
