import { Component, OnInit, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from 'src/app/auth.service';

@Component({
  selector: 'app-addasset',
  templateUrl: './addasset.component.html',
  styleUrls: ['./addasset.component.css']
})
export class AddassetComponent implements OnInit, OnDestroy {

  error: string;
  constructor(private auth: AuthService) { }

  ngOnInit() {
  }

  addAssetData(form:NgForm) {
    this.error = null;
    this.auth.addAsset(form.value)
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
