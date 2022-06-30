import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MatButtonModule } from '@angular/material/button';

import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './_commons/navbar/navbar.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FooterComponent } from './_commons/footer/footer.component';
import { HomePageComponent } from './pages/home-page/home-page.component';
import { FormationComponent } from './pages/formations/formation.component';
import { DetailsFormationComponent } from './pages/Details_Formation/Composante_Principale/details-formation/details-formation.component';
import { DetailsFormationInfosParentComponent } from './pages/Details_Formation/Composante_Gauche/Composante_Parent/details-formation-infos-parent/details-formation-infos-parent.component';
import { DetailsFormationInfosEnfantComponent } from './pages/Details_Formation/Composante_Gauche/Composante_Enfant/details-formation-infos-enfant/details-formation-infos-enfant.component';
import { DetailsFormationInfosBoutonComponent } from './pages/Details_Formation/Composante_Gauche/Composantes_Elementaires/Composante_Bouton/details-formation-infos-bouton/details-formation-infos-bouton.component';
import { DetailsFormationInfosCardComponent } from './pages/Details_Formation/Composante_Gauche/Composantes_Elementaires/Composante_Card/details-formation-infos-card/details-formation-infos-card.component';
import { DetailsFormationInterIntraParentComponent } from './pages/Details_Formation/Composante_Droite/Composante_Parent/details-formation-inter-intra-parent/details-formation-inter-intra-parent.component';
import { DetailsFormationInterIntraEnfantComponent } from './pages/Details_Formation/Composante_Droite/Composante_Enfant/details-formation-inter-intra-enfant/details-formation-inter-intra-enfant.component';
import { DetailsFormationInterIntraInscriptionComponent } from './pages/Details_Formation/Composante_Droite/Composantes_Elementaires/Composante_Bouton_Inscription/details-formation-inter-intra-inscription/details-formation-inter-intra-inscription.component';
import { DetailsFormationInterIntraBoutonOptionsComponent } from './pages/Details_Formation/Composante_Droite/Composantes_Elementaires/Composante_Bouton_InterIntra/details-formation-inter-intra-bouton-options/details-formation-inter-intra-bouton-options.component';
import { InterfaceUtilisateurCardInfosComponent } from './pages/InterfaceUtilisateur/ComposanteInfos/interface-utilisateur-card-infos/interface-utilisateur-card-infos.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    HomePageComponent,
    FormationComponent,
    DetailsFormationComponent,
    DetailsFormationInfosParentComponent,
    DetailsFormationInfosEnfantComponent,
    DetailsFormationInfosBoutonComponent,
    DetailsFormationInfosCardComponent,
    DetailsFormationInterIntraParentComponent,
    DetailsFormationInterIntraEnfantComponent,
    DetailsFormationInterIntraInscriptionComponent,
    DetailsFormationInterIntraBoutonOptionsComponent,
    InterfaceUtilisateurCardInfosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatButtonModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AppModule {}
