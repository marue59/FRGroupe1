import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SousThemeDeThemeComponent } from './sous-theme-de-theme.component';

describe('SousThemeDeThemeComponent', () => {
  let component: SousThemeDeThemeComponent;
  let fixture: ComponentFixture<SousThemeDeThemeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SousThemeDeThemeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SousThemeDeThemeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
