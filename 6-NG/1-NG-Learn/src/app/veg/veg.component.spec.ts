import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VegComponent } from './veg.component';

describe('VegComponent', () => {
  let component: VegComponent;
  let fixture: ComponentFixture<VegComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VegComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VegComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
