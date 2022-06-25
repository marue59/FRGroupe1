import { Component, OnInit } from '@angular/core';
import Formation from 'src/app/models/formation.model';

@Component({
  selector: 'app-formation',
  templateUrl: './formation.component.html',
  styleUrls: ['./formation.component.scss'],
})
export class FormationComponent implements OnInit {
  formation: Formation[] = [];
  constructor() {}

  ngOnInit(): void {}
}
