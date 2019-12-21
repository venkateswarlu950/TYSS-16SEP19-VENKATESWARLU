import { Component, OnInit, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from 'src/app/auth.service';

@Component({
  selector: 'app-raiserequest',
  templateUrl: './raiserequest.component.html',
  styleUrls: ['./raiserequest.component.css']
})
export class RaiserequestComponent implements OnInit ,OnDestroy{

  error: string;

  constructor(private auth: AuthService) { }

  ngOnInit() {
  }

  requestAssetData(form:NgForm) {
    this.error = null;
    this.auth.raiseRequest(form.value)
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
