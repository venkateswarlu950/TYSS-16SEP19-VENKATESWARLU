import { Component, OnInit, Input } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-librarian',
  templateUrl: './librarian.component.html',
  styleUrls: ['./librarian.component.css']
})
export class LibrarianComponent implements OnInit {

details;
  @Input() users;
  constructor() { }

 ngOnInit() {
    this.details = JSON.parse(localStorage.getItem('userDetails'));

  }

}
