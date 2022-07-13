import { Component, Input, OnInit } from '@angular/core';
import SousTheme from 'src/app/models/sousTheme.models';
import { SousThemeService } from 'src/app/services/sousTheme/sous-theme.service';

@Component({
  selector: 'app-sous-theme-de-theme',
  templateUrl: './sous-theme-de-theme.component.html',
  styleUrls: ['./sous-theme-de-theme.component.scss'],
})
export class SousThemeDeThemeComponent implements OnInit {
  @Input() sousThemes: any;

  constructor() {}

  ngOnInit(): void {}
}
