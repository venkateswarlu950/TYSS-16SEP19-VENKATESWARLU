import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  books: any;
  selectedUser;

  constructor(private service: UserService, private route: Router) { }

  getDetails() {
   this.service.getData().subscribe(details => {
     this.books = details;
     console.log(this.books);

    });
   }
  selectUser(user) {
    alert('in ts component');
    console.log(user);
    this.selectedUser = user;
  }
  UpdateData(form: NgForm) {
    console.log('values for update', form.value);
    this.service.updateUser(form.value).subscribe (data => {
    }, err => {
      console.log(err);
    }, () => {
      alert('Data Updated Successfully');
      form.reset();
    });
  }


  ngOnInit() {
  }

}
