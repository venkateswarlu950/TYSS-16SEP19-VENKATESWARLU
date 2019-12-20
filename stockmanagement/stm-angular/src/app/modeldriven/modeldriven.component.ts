import { Component, OnInit } from '@angular/core';
import { NgModel } from '@angular/forms';

@Component({
  selector: 'app-modeldriven',
  templateUrl: './modeldriven.component.html',
  styleUrls: ['./modeldriven.component.css']
})
export class ModeldrivenComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  loginData(form: NgModel) {
    console.log(form);
  }

}
