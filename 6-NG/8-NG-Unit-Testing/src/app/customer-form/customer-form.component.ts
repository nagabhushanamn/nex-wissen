import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-customer-form',
  templateUrl: './customer-form.component.html',
  styleUrls: ['./customer-form.component.css']
})
export class CustomerFormComponent implements OnInit {

  customerForm: FormGroup;
  submitted = false;
 
  constructor(private fb: FormBuilder) { 
    this.customerForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      text: ['', Validators.required]
    })
  }

  ngOnInit() {
  }

  handleSubmit() {
    console.log("submitted...")
    this.submitted = true
  }

}
