import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsFormationInterIntraParentComponent } from './details-formation-inter-intra-parent.component';

describe('DetailsFormationInterIntraParentComponent', () => {
  let component: DetailsFormationInterIntraParentComponent;
  let fixture: ComponentFixture<DetailsFormationInterIntraParentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetailsFormationInterIntraParentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetailsFormationInterIntraParentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
