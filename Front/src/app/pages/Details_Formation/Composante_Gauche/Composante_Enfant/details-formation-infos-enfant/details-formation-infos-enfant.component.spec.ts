import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsFormationInfosEnfantComponent } from './details-formation-infos-enfant.component';

describe('DetailsFormationInfosEnfantComponent', () => {
  let component: DetailsFormationInfosEnfantComponent;
  let fixture: ComponentFixture<DetailsFormationInfosEnfantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetailsFormationInfosEnfantComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetailsFormationInfosEnfantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
