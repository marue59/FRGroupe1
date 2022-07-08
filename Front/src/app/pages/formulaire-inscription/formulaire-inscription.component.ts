import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { FormBuilder } from '@angular/forms';
import { Validators } from '@angular/forms';


@Component({
  selector: 'app-formulaire-inscription',
  templateUrl: './formulaire-inscription.component.html',
  styleUrls: ['./formulaire-inscription.component.scss']
})
export class FormulaireInscriptionComponent implements OnInit {

  constructor(private formbuild : FormBuilder) { }

  ngOnInit(): void {
  }
  profileForm = this.formbuild.group({
    firstName: ['', Validators.required],
    lastName: [''],
    email: [''],
    numTel:[''],
    address: this.formbuild.group({
      street: [''],
      city: [''],
      state: ['']
    })
})
  onSubmit() {
    // TODO: Use EventEmitter with form value
    console.warn(this.profileForm.value);
  }
 
}
