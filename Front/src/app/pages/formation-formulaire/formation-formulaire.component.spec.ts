import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormationFormulaireComponent } from './formation-formulaire.component';

describe('FormationFormulaireComponent', () => {
  let component: FormationFormulaireComponent;
  let fixture: ComponentFixture<FormationFormulaireComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormationFormulaireComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormationFormulaireComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
