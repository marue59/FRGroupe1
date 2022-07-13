import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormationService } from 'src/app/services/formation.service';

@Component({
  selector: 'app-formation-list',
  templateUrl: './formation-list.component.html',
  styleUrls: ['./formation-list.component.scss'],
})
export class FormationListComponent implements OnInit {
  @Input() formations: any;

  constructor() {}

  ngOnInit(): void {}
}
