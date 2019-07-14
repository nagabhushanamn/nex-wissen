import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UserService } from '../user.service';
import { identifierModuleUrl } from '@angular/compiler';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  loginForm: FormGroup;
  message = ''
  constructor(private fb: FormBuilder, private router: Router, private userService: UserService) { }

  ngOnInit() {
    this.loginForm = this.fb.group({
      username: ['', [Validators.required]],
      password: ['', [Validators.required]]
    })
    this.userService.getUserStream()
      .subscribe((e: any) => {
        if (e.isLoggedIn) {
          this.router.navigate(['items'])
        }
        if (!e.isLoggedIn) {
          this.message = "Login Failed.."
        }
      }, err => { })
  }
  handleFormSubmit(event) {
    if (this.loginForm.valid) {
      let credentials = this.loginForm.value;
      this.userService.doLogin(credentials);
    }
  }

}
