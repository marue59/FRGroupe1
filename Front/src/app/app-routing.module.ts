import { NgModule } from '@angular/core';
import { HomePageComponent } from './pages/home-page/home-page.component';
import { RouterModule, Routes } from '@angular/router';
import { FormationComponent } from './pages/formations/formation.component';
import { DetailsFormationComponent } from './pages/Details_Formation/Composante_Principale/details-formation/details-formation.component';


const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: HomePageComponent },
  { path: 'formations', component: FormationComponent },
  { path: 'formations/:id', component: DetailsFormationComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
