import { Component, OnInit, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from 'src/app/auth.service';

@Component({
  selector: 'app-addemployee',
  templateUrl: './addemployee.component.html',
  styleUrls: ['./addemployee.component.css']
})
export class AddemployeeComponent implements OnInit,OnDestroy{

  error: string;

  constructor(private auth: AuthService) { }

  ngOnInit() {
  }

  addEmployeeData(form:NgForm) {
    this.error = null;
    this.auth.addEmployee(form.value)
      .subscribe(res => {
        console.log(res);
        form.reset();
      }, err => {
        console.log(err);
        this.error = err.error.message;
      });
  }

  ngOnDestroy() {
    this.error = null;
  }
}
