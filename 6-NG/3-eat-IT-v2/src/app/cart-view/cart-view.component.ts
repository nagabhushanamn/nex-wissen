import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-cart-view',
  templateUrl: './cart-view.component.html',
  styleUrls: ['./cart-view.component.css']
})
export class CartViewComponent implements OnInit {

  @Input() cart;
  cartItems = [];

  constructor() { }

  ngOnInit() {
  }

  ngDoCheck() {
    this.cartItems = []
    let keys = Object.keys(this.cart);
    keys.forEach(key => this.cartItems.push(this.cart[key].item))
  }

}
