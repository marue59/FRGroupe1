import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsFormationInterIntraInscriptionComponent } from './details-formation-inter-intra-inscription.component';

describe('DetailsFormationInterIntraInscriptionComponent', () => {
  let component: DetailsFormationInterIntraInscriptionComponent;
  let fixture: ComponentFixture<DetailsFormationInterIntraInscriptionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetailsFormationInterIntraInscriptionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetailsFormationInterIntraInscriptionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
