import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-req-list',
  templateUrl: './req-list.component.html',
  styleUrls: ['./req-list.component.css']
})
export class ReqListComponent implements OnInit {
  details: any;
  result: any;
  data: any;

  constructor(private service: UserService, private route: Router) { }

  getDetails() {
    this.service.reqList().subscribe(result => {
   this.details = result;
   console.log('request list', this.details);

    });


  }

  approved(User) {
    alert('in approved');
    this.data = User;
    console.log('values in approve', this.data);
    this.service.approve(this.data).subscribe(approved => {
     if (approved === 'true') {
       this.route.navigateByUrl('/reqList');
     } else {
       alert('approved failed');
     }

   });

  }
  rejected(User) {
    console.log('in reject id', User.id);
    this.service.reject(User.id).subscribe(rejected => {

      this.result = rejected;
      if (this.result === 'true') {
        this.route.navigateByUrl('/reqList');
      }
    });
 }


  ngOnInit() {
  }

}
