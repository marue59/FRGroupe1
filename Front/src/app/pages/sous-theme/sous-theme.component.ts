import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs';

// import du Model
import SousTheme from 'src/app/models/sousTheme.models';

// import du Service
import { SousThemeService } from 'src/app/services/sousTheme/sous-theme.service';

@Component({
  selector: 'app-sous-theme',
  templateUrl: './sous-theme.component.html',
  styleUrls: ['./sous-theme.component.scss'],
})
export class SousThemeComponent implements OnInit {
  //sousThem!: SousTheme;
  sousThemes: SousTheme[] = [];
  subscription!: Subscription;

  constructor(
    private sousThemeService: SousThemeService,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    // recuperer la liste de toute les sousThemes
    this.subscription = this.sousThemeService.currentSousTheme.subscribe(
      (sousThemes) => {
        this.sousThemes = sousThemes;
      }
    );
  }
}
