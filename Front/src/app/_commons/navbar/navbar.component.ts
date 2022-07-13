import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
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
  click: boolean = false;

  constructor(
    private formationService: FormationService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.formationService.getFormations().subscribe((formations) => {
      this.formations = formations;
    });
  }
  onClick() {
    this.click = !this.click;
  }

  goToFormation(id: number) {
    this.router.navigate(['formations', id]);
  }
}
