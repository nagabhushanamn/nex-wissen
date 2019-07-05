import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

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
  reviews = [
    { author: 'who@mail.com', stars: 5, body: 'sample-review-1' },
    { author: 'who@mail.com', stars: 2, body: 'sample-review-2' }
  ]

  ngOnInit() {
  }

  handleBuy(event) {
    this.buy.emit({ item: this.item })
  }

  isTabSelected(tabIndex) {
    return this.currentTab === tabIndex;
  }
  changeTab(event, tabIndex) {
    event.preventDefault();
    this.currentTab = tabIndex;
  }

}
