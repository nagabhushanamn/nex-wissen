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
  items = [
    {
      id: 1,
      name: 'Veg',
      price: 200.00,
      canBuy: true,
      imgPath: `assets/${'veg.png'}`,
      description: 'veg is always yummy'
    },
    {
      id: 2,
      name: 'Non Veg',
      price: 150.00,
      canBuy: true,
      imgPath: "assets/non-veg.png",
      description: 'non-veg is yummy'
    },

  ]

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

  ngOnInit() {
    // setInterval(() => {
    //   this.addToCart({ item: { id: 1, name: '..' } })
    // }, 3000)
  }


}
