import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ThemeService } from 'src/app/services/theme/theme.service';

import Theme from 'src/app/models/theme.model';

@Component({
  selector: 'app-theme-list',
  templateUrl: './theme-list.component.html',
  styleUrls: ['./theme-list.component.scss'],
})
export class ThemeListComponent implements OnInit {
  @Input() themes: any;

  constructor(private router: Router, private themeService: ThemeService) {}

  ngOnInit(): void {}
}
