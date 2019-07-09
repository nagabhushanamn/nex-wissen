import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NonVegComponent } from './non-veg.component';

describe('NonVegComponent', () => {
  let component: NonVegComponent;
  let fixture: ComponentFixture<NonVegComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NonVegComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NonVegComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
