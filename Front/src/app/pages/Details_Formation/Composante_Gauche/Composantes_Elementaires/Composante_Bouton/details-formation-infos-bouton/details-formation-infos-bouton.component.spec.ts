import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsFormationInfosBoutonComponent } from './details-formation-infos-bouton.component';

describe('DetailsFormationInfosBoutonComponent', () => {
  let component: DetailsFormationInfosBoutonComponent;
  let fixture: ComponentFixture<DetailsFormationInfosBoutonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetailsFormationInfosBoutonComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetailsFormationInfosBoutonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
