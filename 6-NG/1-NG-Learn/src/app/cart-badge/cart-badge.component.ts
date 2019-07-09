import { Component, OnInit, ChangeDetectionStrategy, ChangeDetectorRef } from '@angular/core';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-cart-badge',
  templateUrl: './cart-badge.component.html',
  styleUrls: ['./cart-badge.component.css'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class CartBadgeComponent implements OnInit {

  cartQty: number = 0;
  constructor(
    private cartService: CartService,
    private cd: ChangeDetectorRef) { }

  ngOnInit() {
    this.cartService.getStream()
      .subscribe(e => {
        this.cartQty++
        this.cd.markForCheck()
      })
  }

}
