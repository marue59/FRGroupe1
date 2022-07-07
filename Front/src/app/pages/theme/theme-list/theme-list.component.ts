import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-theme-list',
  templateUrl: './theme-list.component.html',
  styleUrls: ['./theme-list.component.scss'],
})
export class ThemeListComponent implements OnInit {
  @Input() themes: any;
  constructor() {}

  ngOnInit(): void {
    console.log(this.themes);
  }

  /*
  {
    "id": 3,
    "nom": "Gestion de proojet",
    "description": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
    ,"sous-theme" : [{
      "id": 1,
      "nom": "JAva",
      "description": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
    },
    {
      "id": 2,
      "nom": "Js",
      "description": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"

    }
  ]
  },
  {
    "id": 4,
    "nom": "Dev",
    "description": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
    ,"sous-theme" : [{
      "id": 1,
      "nom": "JAva",
      "description": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
    },
    {
      "id": 2,
      "nom": "Js",
      "description": "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"

    }
  ]
  }*/
}
