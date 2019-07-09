import { Component, OnInit, Input } from '@angular/core';
import { CartService } from '../cart.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cart-view',
  templateUrl: './cart-view.component.html',
  styleUrls: ['./cart-view.component.css']
})
export class CartViewComponent implements OnInit {

  cart = {};
  cartItems = [];

  constructor(private cartService: CartService,private router:Router) { }

  ngOnInit() {
    this.cart = this.cartService.getCart();
    this.cartItems = []
    let keys = Object.keys(this.cart);
    keys.forEach(key => this.cartItems.push(this.cart[key].item))

    this.cartService.getCartStream()
      .subscribe(e => {
        let { cart } = e;
        this.cart = cart;
        this.cartItems = []
        let keys = Object.keys(this.cart);
        keys.forEach(key => this.cartItems.push(this.cart[key].item))
      })

  }

  incOrDecQty(item, qty) {
    this.cartService.addToCart(item, qty)
  }
  doCheckout() {
    this.cartService.doCheckout()
      .subscribe(e => {
        this.router.navigate(['orders'])
      })
  }

}
