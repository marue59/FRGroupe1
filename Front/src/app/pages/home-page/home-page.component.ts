import { Component, Input, OnInit } from '@angular/core';

// import des Models
import Formation from 'src/app/models/formation.model';

// import des Services
import { FormationService } from 'src/app/services/formation.service';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.scss'],
})
export class HomePageComponent implements OnInit {
  formations: Formation[] = [];

  constructor(private formationService: FormationService) {}

  ngOnInit(): void {
    this.formationService.getFormations().subscribe((formations) => {
      this.formations = formations;
    });
  }
}
