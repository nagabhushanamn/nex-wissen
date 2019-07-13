import { Component } from '@angular/core';
import { AdminService } from './administration/admin.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'NG-modules';
  items = [
    {
      id: 1,
      name: 'item-1',
      price: 1000.00
    },
    {
      id: 2,
      name: 'item-2',
      price: 1000.00
    },
    {
      id: 3,
      name: 'item-3',
      price: 1000.00
    },
    {
      id: 4,
      name: 'item-4',
      price: 1000.00
    }
  ]
  constructor(private adminService: AdminService) {
    console.log(this.adminService.getAdmin())
  }
}
