import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { SousThemeService } from 'src/app/services/sousTheme/sous-theme.service';
import SousTheme from 'src/app/models/sousTheme.models';
@Component({
  selector: 'app-side-bar',
  templateUrl: './side-bar.component.html',
  styleUrls: ['./side-bar.component.scss'],
})
export class SideBarComponent implements OnInit {
  @Input()
  sousTheme!: SousTheme;
  constructor(
    private sousThemeService: SousThemeService,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {}
}
