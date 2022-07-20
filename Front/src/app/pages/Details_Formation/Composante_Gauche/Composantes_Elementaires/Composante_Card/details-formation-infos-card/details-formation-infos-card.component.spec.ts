import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsFormationInfosCardComponent } from './details-formation-infos-card.component';

describe('DetailsFormationInfosCardComponent', () => {
  let component: DetailsFormationInfosCardComponent;
  let fixture: ComponentFixture<DetailsFormationInfosCardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetailsFormationInfosCardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetailsFormationInfosCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
