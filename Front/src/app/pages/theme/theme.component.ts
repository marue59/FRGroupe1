import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';

// import du Model
import Theme from 'src/app/models/theme.model';

// import du Service
import { ThemeService } from 'src/app/services/theme/theme.service';
@Component({
  selector: 'app-theme',
  templateUrl: './theme.component.html',
  styleUrls: ['./theme.component.scss'],
})
export class ThemeComponent implements OnInit {
  themes!: Theme[];
  theme: any;
  subscription!: Subscription;

  constructor(private themeService: ThemeService) {}

  ngOnInit(): void {
    this.subscription = this.themeService.currentTheme.subscribe(
      (themes: any) => {
        this.themes = themes;
      }
    );
  }

  private subscribeSousThemes(id: number) {
    this.themeService.getTheme(id).subscribe((theme) => {
      this.theme = theme;
    });
  }

  private setSubscribe(id: string | null) {
    if (id) {
      this.subscribeSousThemes(+id);
    }
  }
}
