import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SousThemeListComponent } from './sous-theme-list.component';

describe('SousThemeListComponent', () => {
  let component: SousThemeListComponent;
  let fixture: ComponentFixture<SousThemeListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SousThemeListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SousThemeListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
