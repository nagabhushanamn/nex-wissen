import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { CartService } from '../cart.service';
import { ItemService } from '../item.service';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit {

  @Input("value") item;
  @Input("cartQty") cartQty;
  @Output() buy = new EventEmitter();
  currentTab = 1
  reviews = []

  // private cartService: CartService;
  // constructor(cartService: CartService) {
  //   this.cartService = cartService;
  // }
  // or
  constructor(private cartService: CartService, private itemService: ItemService) { }

  ngOnInit() {
  }

  handleBuy(event) {
    //this.buy.emit({ item: this.item })
    this.cartService.addToCart(this.item, 1)
  }

  isTabSelected(tabIndex) {
    return this.currentTab === tabIndex;
  }
  changeTab(event, tabIndex) {
    event.preventDefault();
    this.currentTab = tabIndex;
    if (this.currentTab === 3) {
      this.itemService.getReviews(this.item.id)
        .subscribe((response: any) => {
          this.reviews = response
        })
    }
  }
  handleNewReview(event) {
    this.reviews.push(event);
  }

}
