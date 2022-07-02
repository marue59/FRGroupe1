import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-sous-theme-card',
  templateUrl: './sous-theme-card.component.html',
  styleUrls: ['./sous-theme-card.component.scss'],
})
export class SousThemeCardComponent implements OnInit {
  @Input() sousTheme: any;
  constructor() {}

  ngOnInit(): void {}
}
