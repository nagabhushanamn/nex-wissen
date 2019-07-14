import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(private http: HttpClient) { }

  loadOrders() {
    let api = "http://localhost:8083/api/v1/users/Nag/orders";
    return this.http.get(api)
  }

}
