import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';
import { ssn } from '../validators';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  userForm: FormGroup;
  errors = {}

  constructor(private fb: FormBuilder) { }

  ngOnInit() {
    // this.userForm = new FormGroup({
    //   firstName: new FormControl(''),
    //   lastName: new FormControl(''),
    //   email: new FormControl('')
    // });
    // or
    this.userForm = this.fb.group({
      firstName: ['', [Validators.required, Validators.minLength(3)]],
      lastName: '',
      ssn: ['', [Validators.required, ssn]],
      email: ['', [Validators.required, Validators.email]]
    })

    let firstNameControl = this.userForm.get('firstName');
    firstNameControl.valueChanges
      .subscribe(e => {
        // console.log(e)
      })

    firstNameControl.statusChanges
      .subscribe(e => {
        if (e === 'INVALID') {
          let errors = firstNameControl.errors;
          if (errors.required)
            this.errors['firstName'] = "FirstName is required";
          if (errors.minlength)
            this.errors['firstName'] = "FirstName requires min 3 chars";
        }
        else
          delete this.errors['firstName']
      })

    this.userForm.get('ssn')
      .statusChanges
      .subscribe(e => {
        console.log(e)
      })


  }
  handleBlur(control) {
    control.setValue(control.value)
  }
  loadUser(event) {
    //..
    let userModel = {
      firstName: 'Nag',
      lastName: 'N',
      //email: 'Nag@mail.com'
    }
    //this.userForm.setValue(userModel)
    this.userForm.patchValue(userModel);
  }
  handleFormSubmit(event) {
    if (this.userForm.valid) {
      let formModel = this.userForm.value;
      console.log(formModel);
    } else {
      console.log("invalid form..")
    }
  }

} 
