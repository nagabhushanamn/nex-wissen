import { Injectable } from '@angular/core';
import { Subject, pipe } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators'

@Injectable({
  providedIn: 'root'
})
export class CartService {

  cart = {}
  cartQty = 0;
  cartStream: Subject<any> = new Subject();

  constructor(private http: HttpClient) { }

  getCartStream() {
    return this.cartStream;
  }
  getCart() {
    return this.cart;
  }
  loadCart() {
    //let cart = localStorage.getItem('user-cart') || '{}';
    //this.cart = JSON.parse(cart);
    //this.cartQty = Object.keys(this.cart).length;
    let api = "http://localhost:8082/api/v1/users/Nag/cart";
    this.http.get(api)
      .subscribe((e: any) => {
        e.forEach(element => {
          this.cart[element.item.id] = { item: element.item, qty: element.qty }
        });
        this.cartQty = Object.keys(this.cart).length;
      })
    this.publishToStream()
  }
  addToCart(item, qty) {
    let { id } = item;
    let itemLine = this.cart[id];
    if (itemLine) {
      itemLine = { item, qty: itemLine.qty + qty }
    } else {
      itemLine = { item, qty: 1 }
    }
    this.cart = { ...this.cart, [id]: itemLine }
    if (itemLine.qty === 0)
      delete this.cart[id]
    // localStorage.setItem('user-cart', JSON.stringify(this.cart))
    let api = "http://localhost:8082/api/v1/users/Nag/cart";
    this.http.post(api, itemLine)
      .subscribe(e => {
        this.publishToStream()
      })
  }
  doCheckout() {
    let api = "http://localhost:8083/api/v1/users/Nag/orders";
    return this.http.post(api, {})
      .pipe(map(e => {
        this.cart = {}
        this.cartQty = 0;
        return e;
      }))
  }


  publishToStream() {
    this.cartQty = Object.keys(this.cart).length;
    this.cartStream.next({ cartQty: this.cartQty, cart: this.cart })
  }



}
