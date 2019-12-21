import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {
  books: any;

  constructor(private service: UserService) { }

  getDetails() {
    this.service.getData().subscribe(details => {
      this.books = details;
      console.log(this.books);
     });
    }

  deleteData(User) {
    console.log('in ts ', User.bid);
    this.service.deleteUser(User.bid).subscribe (data => {
      console.log(data);
      this.getDetails();
    }, err => {
      console.log(err);
    }, () => {
      console.log('data deleted successfully');
    });

  }

  ngOnInit() {
  }

}
