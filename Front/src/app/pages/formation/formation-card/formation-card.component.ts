import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-formation-card',
  templateUrl: './formation-card.component.html',
  styleUrls: ['./formation-card.component.scss'],
})
export class FormationCardComponent implements OnInit {
  @Input() formation: any;
  constructor() {}

  ngOnInit(): void {}
}
