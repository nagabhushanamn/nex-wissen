import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'eat-IT-v1';

  items = [
    {
      id: 1,
      name: 'Veg',
      price: 200.00,
      canBuy: true,
      imgPath: "assets/veg.png",
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

}
