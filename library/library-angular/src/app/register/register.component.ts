import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  error: any;

  constructor(private user: UserService, private  router: Router) { }

  register(form: NgForm) {
    console.log('values are', form.value);
    this.user.registerUser(form.value).subscribe(res => {
      form.reset();
      console.log('responding', res.msg);
      // tslint:disable-next-line: no-conditional-assignment
      // tslint:disable-next-line: triple-equals
      if (res != 0  && res != null && res.msg === 'Registration Success') {
      alert('Successfully Registered Please go for login');
      this.router.navigateByUrl('/login');
    } else {
      alert('Registration failed');
    }

   }, err => {
     console.log(err);
     this.error = err.error.message;
   });

  }

  ngOnInit() {
  }

}
