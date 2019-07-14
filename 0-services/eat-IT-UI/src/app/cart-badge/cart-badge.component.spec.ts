import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CartBadgeComponent } from './cart-badge.component';

describe('CartBadgeComponent', () => {
  let component: CartBadgeComponent;
  let fixture: ComponentFixture<CartBadgeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CartBadgeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CartBadgeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
