import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private router: Router, private service: UserService) { }

  isLoggedIn(): boolean {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails) {
      return true;
    } else {
      return false;
    }
  }

  isLib() {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.type === 'lib') {
      return true;
    } else {
      return false;
    }
  }

  isUser() {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.type === 'user') {
      return true;
    } else {
      return false;
    }
  }

  get isLibLoggedIn() {
    return this.service.islibrarianLoggedIn();
  }
  get isUserLoggedIn() {
    return this.service.isUserlogIn();
  }

  logout() {
    localStorage.removeItem('userDetails');
    this.router.navigateByUrl('/login');
    this.service.isLibLoggedIn = false;
    this.service.isUserLoggedIn = false;

  }

  ngOnInit() {
  }

}
