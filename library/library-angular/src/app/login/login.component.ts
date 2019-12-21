import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  // tslint:disable-next-line: variable-name
  constructor(private user: UserService, private _route: Router) { }

  login(form: NgForm) {
    this.user.loginUser(form.value).subscribe(resp => {
      console.log('type in login', resp.registration.type);
      if (resp != null && resp.registration.type === 'user') {
          localStorage.setItem('userDetails', JSON.stringify(resp.registration));
          this._route.navigateByUrl('/user');
        } else if (resp != null && resp.registration.type === 'lib') {
          localStorage.setItem('userDetails', JSON.stringify(resp.registration));
          this._route.navigateByUrl('/lib');
        } else {
          console.log('error msg', resp.msg);
          form.reset();
          alert(resp.msg);
        }
    });

  }

  ngOnInit() {
  }

}
