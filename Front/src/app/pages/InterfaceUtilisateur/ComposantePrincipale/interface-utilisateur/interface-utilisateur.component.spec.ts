import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InterfaceUtilisateurComponent } from './interface-utilisateur.component';

describe('InterfaceUtilisateurComponent', () => {
  let component: InterfaceUtilisateurComponent;
  let fixture: ComponentFixture<InterfaceUtilisateurComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InterfaceUtilisateurComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InterfaceUtilisateurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
