import { TestBed } from '@angular/core/testing';

import { FromationService } from './formation.service';

describe('FormationService', () => {
  let service: FromationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FromationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
