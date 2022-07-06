import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SousThemeComponent } from './sous-theme.component';

describe('SousThemeComponent', () => {
  let component: SousThemeComponent;
  let fixture: ComponentFixture<SousThemeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SousThemeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SousThemeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
