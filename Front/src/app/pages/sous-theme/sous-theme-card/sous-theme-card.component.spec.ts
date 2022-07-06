import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SousThemeCardComponent } from './sous-theme-card.component';

describe('SousThemeCardComponent', () => {
  let component: SousThemeCardComponent;
  let fixture: ComponentFixture<SousThemeCardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SousThemeCardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SousThemeCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
