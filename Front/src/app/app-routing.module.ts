import { NgModule } from '@angular/core';
import { HomePageComponent } from './pages/home-page/home-page.component';
import { RouterModule, Routes } from '@angular/router';

import { DetailsFormationComponent } from './pages/Details_Formation/Composante_Principale/details-formation/details-formation.component';
import { FormationComponent } from './pages/formation/formation.component';
import { ThemeComponent } from './pages/theme/theme.component';
import { SousThemeComponent } from './pages/sous-theme/sous-theme.component';
import { FormulaireInscriptionComponent } from './pages/formulaire-inscription/formulaire-inscription.component';

const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: HomePageComponent },
  { path: 'formations', component: FormationComponent },
  { path: 'formations/:id', component: DetailsFormationComponent},
  { path: 'themes', component: ThemeComponent },
  { path: 'themes/:id', component: ThemeComponent },
  { path: 'sous-themes', component: SousThemeComponent },
  {path:'formulaire-inscription', component: FormulaireInscriptionComponent },
  { path: 'sous-themes/:id', component: SousThemeComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
