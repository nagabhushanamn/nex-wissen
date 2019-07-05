import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css']
})
export class ReviewComponent implements OnInit {

  @Input("value") review;

  stars = [];

  constructor() { }

  ngOnInit() {
  }

  ngDoCheck() {
    this.stars = []
    for (let i = 0; i < this.review.stars; i++)
      this.stars.push(i)
  }

}
