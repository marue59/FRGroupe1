import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SousThemeByIdComponent } from './sous-theme-by-id.component';

describe('SousThemeByIdComponent', () => {
  let component: SousThemeByIdComponent;
  let fixture: ComponentFixture<SousThemeByIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SousThemeByIdComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SousThemeByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
