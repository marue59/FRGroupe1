import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { SousThemeService } from 'src/app/services/sousTheme/sous-theme.service';
import SousTheme from 'src/app/models/sousTheme.models';
import { ThemeService } from 'src/app/services/theme/theme.service';
import { Subscription } from 'rxjs';
@Component({
  selector: 'app-side-bar',
  templateUrl: './side-bar.component.html',
  styleUrls: ['./side-bar.component.scss'],
})
export class SideBarComponent implements OnInit {
  @Input()
  sousTheme!: SousTheme;

  themes!: any;
  subscription!: Subscription;

  constructor(
    private sousThemeService: SousThemeService,
    private route: ActivatedRoute,
    private themeService: ThemeService
  ) {}

  ngOnInit(): void {
    this.subscription = this.themeService.currentTheme.subscribe((themes) => {
      this.themes = themes;
      console.log(this.themes);
    });
  }
}
