import { Component, Input, OnInit } from '@angular/core';
import { SousThemeListComponent } from '../../sous-theme/sous-theme-list/sous-theme-list.component';

@Component({
  selector: 'app-theme-list',
  templateUrl: './theme-list.component.html',
  styleUrls: ['./theme-list.component.scss'],
})
export class ThemeListComponent implements OnInit {
  @Input() themes: any;
  constructor() {}

  ngOnInit(): void {}
}
