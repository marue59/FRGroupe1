import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-details-formation-inter-intra-inscription',
  templateUrl: './details-formation-inter-intra-inscription.component.html',
  styleUrls: ['./details-formation-inter-intra-inscription.component.scss']
})
export class DetailsFormationInterIntraInscriptionComponent implements OnInit {

  /**
   * Le nom du bouton : Inter/Intra/Personnalisé
   */
   @Input()
   boutonNom!: string;

  constructor(private router: Router) { }

  ngOnInit(): void {
  }


  changePage(){
    if(this.boutonNom === 'Inscription'){
      this.router.navigateByUrl('formulaire-inscription');
    }
  }


}
