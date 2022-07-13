import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
//sss
import { SousThemeService } from 'src/app/services/sousTheme/sous-theme.service';

@Component({
  selector: 'app-sous-theme-list',
  templateUrl: './sous-theme-list.component.html',
  styleUrls: ['./sous-theme-list.component.scss'],
})
export class SousThemeListComponent implements OnInit {
  @Input() sousThemes: any;

  constructor(
    private router: Router,
    private sousThemeService: SousThemeService
  ) {}

  ngOnInit(): void {}

  changeRoute(id: number) {
    console.log('toto');
    console.log(id);

    this.router.navigate(['sous-themes', id]);
    this.sousThemeService.getSousThemeById(id);
  }
}
