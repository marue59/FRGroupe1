import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs';
import Formation from 'src/app/models/formation.model';
import { FormationService } from 'src/app/services/formation.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss'],
  providers: [FormationService],
})
export class NavbarComponent implements OnInit {
  formations: Formation[] = [];
  formationsCopy: Formation[] = [];
  click: boolean = false;
  forma: any;
  subscription!: Subscription;

  constructor(
    private formationService: FormationService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.formationService.getFormations().subscribe((formations) => {
      this.formations = formations;
      this.formationsCopy = formations;
    });
  }

  //SearchBar
  onClick() {
    this.click = !this.click;
  }
  onChangeFormationInput($event: any) {
    console.log($event);

    this.formationsCopy = this.formations.filter((formationObject: any) =>
      formationObject.nom.includes($event)
    );
    this.router.navigate(['formations/search', $event]);
  }

  goToFormation($event: any) {
    this.router.navigate(['formations/search', $event]);
  }
}
