import { Component, OnInit } from '@angular/core';

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
  sousThemes: SousTheme[] = [];

  constructor(private sousThemeService: SousThemeService) {}

  ngOnInit(): void {
    this.sousThemeService.getSousThemes().subscribe((sousThemes) => {
      this.sousThemes = sousThemes;
      console.log(sousThemes);
    });
  }
}
