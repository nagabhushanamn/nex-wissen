import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  cartStream = new Subject()

  getStream() {
    return this.cartStream;
  }

  addToCart(item) {
    this.cartStream.next({ item })
  }

  constructor() { }


}
