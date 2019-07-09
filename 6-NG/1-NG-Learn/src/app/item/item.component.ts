import { Component, OnInit, Input } from '@angular/core';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit {

  @Input("value") item;

  constructor(private cartService: CartService) { }

  ngOnInit() {
  }

  buy() {
    this.cartService.addToCart(this.item);
  }

}
