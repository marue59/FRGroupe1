import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InterfaceUtilisateurCardInfosComponent } from './interface-utilisateur-card-infos.component';

describe('InterfaceUtilisateurCardInfosComponent', () => {
  let component: InterfaceUtilisateurCardInfosComponent;
  let fixture: ComponentFixture<InterfaceUtilisateurCardInfosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InterfaceUtilisateurCardInfosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InterfaceUtilisateurCardInfosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
