import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InterfaceUtilisateurCardFormationEnCoursComponent } from './interface-utilisateur-card-formation-en-cours.component';

describe('InterfaceUtilisateurCardFormationEnCoursComponent', () => {
  let component: InterfaceUtilisateurCardFormationEnCoursComponent;
  let fixture: ComponentFixture<InterfaceUtilisateurCardFormationEnCoursComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InterfaceUtilisateurCardFormationEnCoursComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InterfaceUtilisateurCardFormationEnCoursComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
