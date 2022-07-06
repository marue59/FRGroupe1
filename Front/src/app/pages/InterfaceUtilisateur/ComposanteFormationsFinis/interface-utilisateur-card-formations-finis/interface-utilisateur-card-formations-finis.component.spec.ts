import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InterfaceUtilisateurCardFormationsFinisComponent } from './interface-utilisateur-card-formations-finis.component';

describe('InterfaceUtilisateurCardFormationsFinisComponent', () => {
  let component: InterfaceUtilisateurCardFormationsFinisComponent;
  let fixture: ComponentFixture<InterfaceUtilisateurCardFormationsFinisComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InterfaceUtilisateurCardFormationsFinisComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InterfaceUtilisateurCardFormationsFinisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
