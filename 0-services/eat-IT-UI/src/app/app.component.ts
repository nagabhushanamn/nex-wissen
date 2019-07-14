import { Component } from '@angular/core';
import { CartService } from './cart.service';
import { UserService } from './user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'eat-IT-v1';
  user = '';

  constructor(private cartService: CartService, private router: Router, private userService: UserService) { }

  ngOnInit() {
    this.cartService.loadCart()
    if (this.userService.isUserLoggedIn()) {
      this.user = this.userService.getUser()
    }
    this.userService.getUserStream()
      .subscribe(e => {
        this.user = this.userService.getUser()
      })
  }

  logout() {
    if (this.userService.doLogout())
      window.location.reload();
  }


}
