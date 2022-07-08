import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-sous-theme-list',
  templateUrl: './sous-theme-list.component.html',
  styleUrls: ['./sous-theme-list.component.scss'],
})
export class SousThemeListComponent implements OnInit {
  @Input() sousThemes: any;
  constructor() {}

  ngOnInit(): void {}
}
