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
  @Input() sousTheme!: SousTheme;
  sousThemes: SousTheme[] = [];
  subscription!: Subscription;

  constructor(
    private sousThemeService: SousThemeService,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    // a chaque fois que l'id change on met a jours la variable
    this.route.paramMap.subscribe((params) => {
      if (params.get('id')) {
        this.subscription = this.sousThemeService
          .getSousThemeByIdObs(params.get('id'))
          .subscribe((sousTheme) => {
            this.sousTheme = sousTheme;

            console.log(sousTheme);
          });
      }
      // this.setSubscribe(id);
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
    });
  }

  private setSubscribe(id: string | null) {
    if (id) {
      this.subscribeSousThemes(+id);
    }
  }
}
