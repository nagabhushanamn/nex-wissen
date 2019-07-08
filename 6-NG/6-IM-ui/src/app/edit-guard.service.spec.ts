import { TestBed } from '@angular/core/testing';

import { EditGuardService } from './edit-guard.service';

describe('EditGuardService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EditGuardService = TestBed.get(EditGuardService);
    expect(service).toBeTruthy();
  });
});
