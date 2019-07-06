import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ItemListComponent implements OnInit {

  cart = {};
  @Output() buy = new EventEmitter();

  addToCart(event) {
    this.buy.emit(event);
  }

  items = [
    {
      id: 1,
      name: 'Veg',
      price: 200.00,
      currency: 'INR',
      discount: 30,
      canBuy: true,
      date: Date.now(),
      imgPath: `assets/${'veg.png'}`,
      description: 'veg is always yummy'
    },
    {
      id: 2,
      name: 'Non Veg',
      price: 150.00,
      currency: 'INR',
      canBuy: true,
      date: Date.now(),
      imgPath: "assets/non-veg.png",
      description: 'non-veg is yummy'
    },

  ]

  constructor(private cartService: CartService) { }

  ngOnInit() {
    this.cart = this.cartService.getCart();
    this.cartService.getCartStream()
      .subscribe(e => {
        this.cart = e.cart;
      })
  }

}
