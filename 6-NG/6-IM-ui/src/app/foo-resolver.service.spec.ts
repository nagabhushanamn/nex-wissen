import { TestBed } from '@angular/core/testing';

import { FooResolverService } from './foo-resolver.service';

describe('FooResolverService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: FooResolverService = TestBed.get(FooResolverService);
    expect(service).toBeTruthy();
  });
});
