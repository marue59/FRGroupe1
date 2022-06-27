import { Component, Input, OnInit } from '@angular/core';
import Formation from 'src/app/models/formation.model';

@Component({
  selector: 'app-formation',
  templateUrl: './formation.component.html',
  styleUrls: ['./formation.component.scss'],
})
export class FormationComponent implements OnInit {
  @Input()
  formation!: any;
  formations: Formation[] = [];
  constructor() {}

  ngOnInit(): void {}
}
