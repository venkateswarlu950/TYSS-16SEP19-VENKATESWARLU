import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminsinglepage',
  templateUrl: './adminsinglepage.component.html',
  styleUrls: ['./adminsinglepage.component.css']
})
export class AdminsinglepageComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  logout() {
    localStorage.removeItem('userDetails');
    this.router.navigateByUrl('/login');
  }

  

}
