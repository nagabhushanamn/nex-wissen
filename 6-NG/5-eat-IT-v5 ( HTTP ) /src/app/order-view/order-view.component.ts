import { Component, OnInit } from '@angular/core';
import { OrderService } from '../order.service';

@Component({
  selector: 'app-order-view',
  templateUrl: './order-view.component.html',
  styleUrls: ['./order-view.component.css']
})
export class OrderViewComponent implements OnInit {

  orders: Array<any> = [];

  constructor(private orderService: OrderService) { }

  ngOnInit() {
    this.orderService.loadOrders()
      .subscribe((e: any) => {
        this.orders = e;
      })
  }



}
