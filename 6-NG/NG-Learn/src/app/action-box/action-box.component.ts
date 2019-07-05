import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-action-box',
  templateUrl: './action-box.component.html',
  styleUrls: ['./action-box.component.css']
})
export class ActionBoxComponent implements OnInit {

  totalCount = 0;

  numbers = [1, 2, 3, 4, -5, 6, -7, 8, 9]

  constructor() { }

  ngOnInit() {
  }

  incementTotalCount(event) {
    this.totalCount += event.value;
  }

}
