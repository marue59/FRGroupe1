import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-theme-card',
  templateUrl: './theme-card.component.html',
  styleUrls: ['./theme-card.component.scss'],
})
export class ThemeCardComponent implements OnInit {
  @Input() themes: any;
  constructor() {}

  ngOnInit(): void {}
}
