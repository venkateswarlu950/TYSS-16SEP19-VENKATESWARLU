import { Component, OnInit, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from 'src/app/auth.service';

@Component({
  selector: 'app-updateasset',
  templateUrl: './updateasset.component.html',
  styleUrls: ['./updateasset.component.css']
})
export class UpdateassetComponent implements OnInit,OnDestroy {

  error: string;
  constructor(private auth: AuthService) { }

  ngOnInit() {
    
  }

  updateAssetData(form:NgForm) {
    this.error = null;
    this.auth.updateAsset(form.value)
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
