import { TestBed } from '@angular/core/testing';

import { ItemsResolverService } from './items-resolver.service';

describe('ItemResolverService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ItemsResolverService = TestBed.get(ItemsResolverService);
    expect(service).toBeTruthy();
  });
});
