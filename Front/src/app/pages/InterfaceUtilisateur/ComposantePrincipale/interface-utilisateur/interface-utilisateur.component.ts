import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-interface-utilisateur',
  templateUrl: './interface-utilisateur.component.html',
  styleUrls: ['./interface-utilisateur.component.scss']
})
export class InterfaceUtilisateurComponent implements OnInit {

  isActive: boolean = false;

  constructor() { }

  ngOnInit(): void {
  }

  onClick(){
    this.isActive = !this.isActive;
  }



}
