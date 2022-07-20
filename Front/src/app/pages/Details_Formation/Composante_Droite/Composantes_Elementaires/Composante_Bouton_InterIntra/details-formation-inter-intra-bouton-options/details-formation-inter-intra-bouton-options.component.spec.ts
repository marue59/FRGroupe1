import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsFormationInterIntraBoutonOptionsComponent } from './details-formation-inter-intra-bouton-options.component';

describe('DetailsFormationInterIntraBoutonOptionsComponent', () => {
  let component: DetailsFormationInterIntraBoutonOptionsComponent;
  let fixture: ComponentFixture<DetailsFormationInterIntraBoutonOptionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetailsFormationInterIntraBoutonOptionsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetailsFormationInterIntraBoutonOptionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
