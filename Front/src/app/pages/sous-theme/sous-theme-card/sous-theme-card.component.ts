import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs';

// import du Model
import SousTheme from 'src/app/models/sousTheme.models';

// import du Service
import { SousThemeService } from 'src/app/services/sousTheme/sous-theme.service';

@Component({
  selector: 'app-sous-theme-card',
  templateUrl: './sous-theme-card.component.html',
  styleUrls: ['./sous-theme-card.component.scss'],
})
export class SousThemeCardComponent implements OnInit {
  sousTheme!: SousTheme;
  sousThemes: SousTheme[] = [];
  subscription!: Subscription;
  id: number;

  constructor(
    private sousThemeService: SousThemeService,
    private route: ActivatedRoute
  ) {
    this.id = this.route.snapshot.params['id'];
  }

  ngOnInit(): void {
    this.subscription = this.sousThemeService
      .getSousThemeByIdObs(this.id)
      .subscribe((sousTheme) => {
        this.sousTheme = sousTheme;
      });

    // const id = this.route.snapshot.paramMap.get('id');
    // this.setSubscribe(id);
    // this.sousThemeService.getSousThemes().subscribe((sousThemes) => {
    //   this.sousThemes = sousThemes;
    // });
  }
  private subscribeSousThemes(id: number) {
    this.sousThemeService.getSousTheme(id).subscribe((sousTheme) => {
      this.sousTheme = sousTheme;
      console.log(this.sousTheme);
    });
  }

  private setSubscribe(id: string | null) {
    if (id) {
      this.subscribeSousThemes(+id);
    }
  }
}
