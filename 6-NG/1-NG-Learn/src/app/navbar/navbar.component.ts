import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor(private cd: ChangeDetectorRef, private loginService: LoginService) { }

  currentUser;

  ngOnInit() {
    this.cd.detach()
    this.loginService.getStream()
      .subscribe((e: any) => {
        this.currentUser = e.user;
        this.cd.reattach();
      })
  }


}
