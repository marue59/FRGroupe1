import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsFormationInfosParentComponent } from './details-formation-infos-parent.component';

describe('DetailsFormationInfosParentComponent', () => {
  let component: DetailsFormationInfosParentComponent;
  let fixture: ComponentFixture<DetailsFormationInfosParentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetailsFormationInfosParentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetailsFormationInfosParentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
