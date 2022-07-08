import { Component, Input, OnInit } from '@angular/core';
import Themes from 'src/app/models/theme.model';
import { ThemeService } from 'src/app/services/theme/theme.service';

@Component({
  selector: 'app-theme-card',
  templateUrl: './theme-card.component.html',
  styleUrls: ['./theme-card.component.scss'],
})
export class ThemeCardComponent implements OnInit {
  @Input() themes: any;

  themeArray: Themes[] = [];

  constructor(private themeService: ThemeService) {}

  ngOnInit(): void {}
}
