import { SlicePipe } from '@angular/common';
import { Component, Input, OnInit } from '@angular/core';

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
  formations: Formation[] = [];

  constructor(private formationService: FormationService) {}

  ngOnInit(): void {
    // recuperer la liste de toute les formations
    this.formationService.getFormations().subscribe((formations) => {
      this.formations = formations;
    });
  }
}
