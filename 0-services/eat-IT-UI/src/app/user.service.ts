import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ReplaySubject } from 'rxjs'

import * as jwt_decode from 'jwt-decode';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  userAuthToken: string = ''
  user = ''
  roles = []
  userStream = new ReplaySubject()

  constructor(private _http: HttpClient) {
    this.userAuthToken = localStorage.getItem('user-token') || ''
    if (this.userAuthToken)
      this.decodeToken();
  }

  getUserStream() {
    return this.userStream;
  }

  getUserAuthToken(){
    if(this.userAuthToken) return this.userAuthToken;
  }

  isUserLoggedIn() {
    return this.userAuthToken !== "";
  }
  getUser() {
    return this.user;
  }
  getRoles() {
    return this.roles;
  }

  doLogout() {
    localStorage.removeItem('user-token');
    return true;
  }

  doLogin(credentials) {
    let url = "http://localhost:8081/login";
    this._http.post(url, credentials)
      .subscribe((e: any) => {
        this.userAuthToken = e.token;
        this.decodeToken();
        localStorage.setItem('user-token', e.token)
        this.userStream.next({ isLoggedIn: true })
      }, error => {
        this.userStream.next({ isLoggedIn: false })
      })
  }
  decodeToken() {
    var decoded = jwt_decode(this.userAuthToken);
    this.user = decoded.sub;
    if (decoded.roles)
      this.roles = decoded.roles;
  }

}
