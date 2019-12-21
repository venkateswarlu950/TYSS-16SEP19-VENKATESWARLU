import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-books-list',
  templateUrl: './books-list.component.html',
  styleUrls: ['./books-list.component.css']
})
export class BooksListComponent implements OnInit {
  books: any;

  constructor(private service: UserService) { }

  getDetails() {
    this.service.getData().subscribe(details => {
      this.books = details;
      console.log(this.books);
    });
    }

  ngOnInit() {
  }

}
