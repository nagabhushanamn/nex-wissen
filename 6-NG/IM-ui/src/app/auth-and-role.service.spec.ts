import { TestBed } from '@angular/core/testing';

import { AuthAndRoleService } from './auth-and-role.service';

describe('AuthAndRoleService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AuthAndRoleService = TestBed.get(AuthAndRoleService);
    expect(service).toBeTruthy();
  });
});
