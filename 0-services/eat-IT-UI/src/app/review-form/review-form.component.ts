import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms'
import { ItemService } from '../item.service';

@Component({
  selector: 'app-review-form',
  templateUrl: './review-form.component.html',
  styleUrls: ['./review-form.component.css']
})
export class ReviewFormComponent implements OnInit {


  isOpen = false;
  reviewForm: FormGroup

  @Input() itemId;
  @Output() onSubmit = new EventEmitter()

  constructor(private fb: FormBuilder, private itemService: ItemService) { }

  toggleForm() {
    this.isOpen = !this.isOpen;
  }

  ngOnInit() {
    this.reviewForm = this.fb.group({
      stars: [5],
      author: ['Nag@email.com'],
      body: ['']
    })
  }
  handleFormSubmit() {
    if (this.reviewForm.valid) {
      let formData = this.reviewForm.value;
      this.itemService.postReview(this.itemId, formData)
        .subscribe(e => {
          this.onSubmit.emit(e);
          this.toggleForm()
        })
    }
  }

}
