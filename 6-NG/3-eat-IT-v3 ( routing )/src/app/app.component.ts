import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  title = 'eat-IT-v1';
  cart = {}
  cartQty = 0;

  addToCart(event) {
    let { item } = event;
    let { id } = item;
    let itemLine = this.cart[id];
    if (itemLine) {
      itemLine = { item, qty: itemLine.qty + 1 }
    } else {
      itemLine = { item, qty: 1 }
    }
    this.cart = { ...this.cart, [id]: itemLine }
    this.cartQty = Object.keys(this.cart).length;
  }



}
