import { Component } from '@angular/core';
import { CartService } from './cart.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'eat-IT-v1';

  constructor(private cartService: CartService) { }

  ngOnInit() {
    this.cartService.loadCart()
  }


}
