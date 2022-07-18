import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import SousTheme from 'src/app/models/sousTheme.models';
import Theme from 'src/app/models/theme.model';
import { SousThemeService } from 'src/app/services/sousTheme/sous-theme.service';
import { ThemeService } from 'src/app/services/theme/theme.service';

@Component({
  selector: 'app-theme-by-id',
  templateUrl: './theme-by-id.component.html',
  styleUrls: ['./theme-by-id.component.scss'],
})
export class ThemeByIdComponent implements OnInit {
  @Input() theme!: Theme;
  sousThemes: SousTheme[] = [];

  constructor(
    private route: ActivatedRoute,
    private themeService: ThemeService,
    private sousThemesService: SousThemeService
  ) {}

  ngOnInit(): void {
    // a chaque fois que l'id change on met a jours la variable
    this.route.paramMap.subscribe((params) => {
      const id = params.get('id');
      this.setSubscribe(id);
    });

    // recuperer la liste de toute les sous themes
    /*this.sousThemesService.getSousThemes().subscribe((sousThemes) =.> {
      this.sousThemes = sousThemes;
    });*/
  }
  // recuperer la liste de toute des themes par l'id
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
