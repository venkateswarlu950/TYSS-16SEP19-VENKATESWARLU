import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  details: any;

  constructor() { }

  ngOnInit() {
    this.details = JSON.parse(localStorage.getItem('userDetails'));
  }

}
