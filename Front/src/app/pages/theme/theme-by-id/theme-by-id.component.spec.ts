import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ThemeByIdComponent } from './theme-by-id.component';

describe('ThemeByIdComponent', () => {
  let component: ThemeByIdComponent;
  let fixture: ComponentFixture<ThemeByIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ThemeByIdComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ThemeByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
