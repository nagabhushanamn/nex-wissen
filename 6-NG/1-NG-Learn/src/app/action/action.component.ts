import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-action',
  templateUrl: './action.component.html',
  styleUrls: ['./action.component.css']
})
export class ActionComponent implements OnInit {


  @Input() value = "Unknown"
  count = 0;
  @Output() boom = new EventEmitter();

  constructor() { }

  ngOnInit() {
  }

  incementCount(event) {
    //console.dir(event)
    this.count++;
    this.boom.emit({ value: (Number.parseInt(this.value, 10)) * this.count })
  }


}
