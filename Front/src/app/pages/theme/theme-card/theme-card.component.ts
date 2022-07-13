import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import SousTheme from 'src/app/models/sousTheme.models';
import Theme from 'src/app/models/theme.model';
import Themes from 'src/app/models/theme.model';
import { SousThemeService } from 'src/app/services/sousTheme/sous-theme.service';
import { ThemeService } from 'src/app/services/theme/theme.service';

@Component({
  selector: 'app-theme-card',
  templateUrl: './theme-card.component.html',
  styleUrls: ['./theme-card.component.scss'],
})
export class ThemeCardComponent implements OnInit {
  @Input() theme!: Theme;

  sousThemes: SousTheme[] = [];
  themes: any;

  constructor(
    private route: ActivatedRoute,
    private themeService: ThemeService,
    private sousThemesService: SousThemeService
  ) {}

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id');

    this.setSubscribe(id);

    // recuperer la liste de toute les sous themes
    this.sousThemesService.getSousThemes().subscribe((sousThemes) => {
      this.sousThemes = sousThemes;
    });
  }

  private subscribeThemes(id: number) {
    this.themeService.getTheme(id).subscribe((theme) => {
      this.theme = theme;
    });
  }

  private setSubscribe(id: string | null) {
    if (id) {
      this.subscribeThemes(+id);
    }
  }
}
