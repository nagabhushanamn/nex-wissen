import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { CartService } from '../cart.service';
import { ItemService } from '../item.service';

@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ItemListComponent implements OnInit {

  cart = {};
  items = []

  constructor(private cartService: CartService, private itemService: ItemService) { }

  ngOnInit() {
    this.items = this.itemService.getItems();
    this.cart = this.cartService.getCart();
    this.cartService.getCartStream()
      .subscribe(e => {
        this.cart = e.cart;
      })
  }

}
