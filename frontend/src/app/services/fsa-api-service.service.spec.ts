import { TestBed } from '@angular/core/testing';

import { FsaApiServiceService } from './fsa-api-service.service';

describe('FsaApiServiceService', () => {
  let service: FsaApiServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FsaApiServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
