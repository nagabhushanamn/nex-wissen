import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-cart-badge',
  templateUrl: './cart-badge.component.html',
  styleUrls: ['./cart-badge.component.css']
})
export class CartBadgeComponent implements OnInit {


  @Input() value;

  constructor() { }

  ngOnInit() {
  }

}
