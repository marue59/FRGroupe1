import { Component, Input, OnInit } from '@angular/core';
import Formation from 'src/app/models/formation.model';

@Component({
  selector: 'app-formation-card',
  templateUrl: './formation-card.component.html',
  styleUrls: ['./formation-card.component.scss'],
})
export class FormationCardComponent implements OnInit {
  @Input() formations: any;
  constructor() {}

  ngOnInit(): void {}
}
