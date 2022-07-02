import { TestBed } from '@angular/core/testing';

import { SousThemeService } from './sous-theme.service';

describe('SousThemeService', () => {
  let service: SousThemeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SousThemeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
