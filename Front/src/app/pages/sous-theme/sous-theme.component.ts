import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

// import du Model
import SousTheme from 'src/app/models/sousTheme.models';

// import du Service
import { SousThemeService } from 'src/app/services/sousTheme/sous-theme.service';

@Component({
  selector: 'app-sous-theme',
  templateUrl: './sous-theme.component.html',
  styleUrls: ['./sous-theme.component.scss'],
})
export class SousThemeComponent implements OnInit {
  //sousThem!: SousTheme;
  @Input() sousThemes: any;

  constructor(
    private sousThemeService: SousThemeService,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    // recuperer la liste de toute les sousThemes
    this.sousThemeService.getSousThemes().subscribe((sousThemes) => {
      this.sousThemes = sousThemes;
    });
  }

  /* const id = this.route.snapshot.paramMap.get('id');
    this.setSubscribe(id);
  }

  setSubscribe(id: string | null) {
    throw new Error('Method not implemented.');
  }

  private subscribeSousTheme(id: number): void {
    this.sousThemeService.getSousTheme(id).subscribe((sousTheme: SousTheme) => {
      this.sousThem = sousTheme;
      console.log(sousTheme);
    });
  }*/
}
