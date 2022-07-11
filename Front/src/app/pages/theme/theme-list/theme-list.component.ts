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
  theme!: Theme;

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private themeService: ThemeService
  ) {}

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id');

    this.setSubscribe(id);
  }

  private subscribeThemes(id: number) {
    this.themeService.getTheme(id).subscribe((themes) => {
      this.themes = themes;
    });
  }

  private setSubscribe(id: string | null) {
    if (id) {
      this.subscribeThemes(+id);
    }
  }
}
