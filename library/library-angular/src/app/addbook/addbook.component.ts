import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { from } from 'rxjs';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit {

  constructor(private add: UserService, private route: Router) { }

  addBook(form: NgForm) {

    this.add.bookAdd(form.value).subscribe(resp => {
      console.log('values here', form.value);
      console.log(resp);
      if (resp !== null) {
        alert('Booking Adding Succesfull');
        form.reset();
      } else {
        alert('Adding Failed');
        form.reset();
      }

    });
  }

  ngOnInit() {
  }

}
