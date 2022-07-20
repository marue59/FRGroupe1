import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsFormationInterIntraEnfantComponent } from './details-formation-inter-intra-enfant.component';

describe('DetailsFormationInterIntraEnfantComponent', () => {
  let component: DetailsFormationInterIntraEnfantComponent;
  let fixture: ComponentFixture<DetailsFormationInterIntraEnfantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetailsFormationInterIntraEnfantComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetailsFormationInterIntraEnfantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
