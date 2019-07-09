import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }

  userStream = new Subject()

  getStream() {
    return this.userStream;
  }

  login(user) {
    this.userStream.next({ user: user })
  }

}
