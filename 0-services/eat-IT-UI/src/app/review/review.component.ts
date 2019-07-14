import { Component, OnInit, Input } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css']
})
export class ReviewComponent implements OnInit {

  @Input("value") review;

  currentUser = ''

  stars = [];

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.currentUser = this.userService.getUser();
  }

  ngDoCheck() {
    this.stars = []
    for (let i = 0; i < this.review.stars; i++)
      this.stars.push(i)
  }

}
