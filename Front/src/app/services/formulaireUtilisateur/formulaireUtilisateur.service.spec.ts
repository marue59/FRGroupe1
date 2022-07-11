import { TestBed } from '@angular/core/testing';
import { FormulaireUtilisateurService } from './formulaireUtilisateur.service';



describe('FormulaireUtilisateurService', () => {
  let service: FormulaireUtilisateurService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FormulaireUtilisateurService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
