import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgModel } from '@angular/forms';
import { CustomValidation } from './customValidation';

@Component({
  selector: 'app-reactive',
  templateUrl: './reactive.component.html',
  styleUrls: ['./reactive.component.css']
})
export class ReactiveComponent implements OnInit {

  get title() {
    return this.form.get('title');
  }
  get url() {
    return this.form.get('url');
  }
  get des() {
    return this.form.get('des');
  }

 form =  new FormGroup({
title : new FormControl('', [Validators.required, CustomValidation.unique]),
url : new FormControl('', [Validators.required]),
des : new FormControl('', [Validators.required])
 });

  constructor() { }

  ngOnInit() {
  }

  loginData(form: NgModel) {
    console.log(form);
  }

}
