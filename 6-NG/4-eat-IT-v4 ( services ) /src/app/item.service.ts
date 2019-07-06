import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  constructor() { }

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

  getItems() {
    return this.items;
  }
  getReviews(id) {
    return [
      { author: 'who@mail.com', stars: 5, body: 'sample-review-1' },
      { author: 'who@mail.com', stars: 2, body: 'sample-review-2' }
    ]
  }

}
