import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-book-request',
  templateUrl: './book-request.component.html',
  styleUrls: ['./book-request.component.css']
})
export class BookRequestComponent implements OnInit {
books: any;
  selectedUser: any;
  details: any;
  constructor(private service: UserService) {
   }

  selectUser(user) {
    alert('in ts component');
    console.log(user);
    this.selectedUser = user;
  }

  getDetails() {
    this.service.getData().subscribe(details => {
      this.books = details;

      console.log(this.books);
     });
    }

    requestBook(form: NgForm) {
      console.log('values from', form.value);

      this.service.requestData(form.value).subscribe (data => {
      }, err => {
        console.log(err);
      }, () => {
        alert('book Requested Successfully');
        form.reset();
      });
    }

  ngOnInit() {
    this.details = JSON.parse(localStorage.getItem('userDetails'));
  }

}
