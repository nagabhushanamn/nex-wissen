import { TestBed } from '@angular/core/testing';

import { FormStatusCheckService } from './form-status-check.service';

describe('FormStatusCheckService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: FormStatusCheckService = TestBed.get(FormStatusCheckService);
    expect(service).toBeTruthy();
  });
});
