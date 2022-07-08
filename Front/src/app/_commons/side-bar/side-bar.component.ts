import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { SousThemeService } from 'src/app/services/sousTheme/sous-theme.service';
import { ThemeService } from 'src/app/services/theme/theme.service';
import { Subscription } from 'rxjs';

import SousTheme from 'src/app/models/sousTheme.models';
import { FormationService } from 'src/app/services/formation.service';

@Component({
  selector: 'app-side-bar',
  templateUrl: './side-bar.component.html',
  styleUrls: ['./side-bar.component.scss'],
})
export class SideBarComponent implements OnInit {
  themes!: any;
  subscription!: Subscription;
  sousThemes: any[] = [];
  formations: any[] = [];

  constructor(
    private sousThemeService: SousThemeService,
    private route: ActivatedRoute,
    private themeService: ThemeService,
    private formationService: FormationService
  ) {}

  ngOnInit(): void {
    this.subscription = this.themeService.currentTheme.subscribe((themes) => {
      this.themes = themes;
    });

    // Souscription au service sousThemes pour récupérer les formations
    this.sousThemeService.getSousThemes().subscribe((sousThemes) => {
      this.sousThemes = sousThemes;
    });

    // Souscription au service formation pour récupérer les formations
    this.formationService.getFormations().subscribe((formations) => {
      this.formations = formations;
    });
  }
}
