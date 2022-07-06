import { Component, Input, OnInit } from '@angular/core';

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
