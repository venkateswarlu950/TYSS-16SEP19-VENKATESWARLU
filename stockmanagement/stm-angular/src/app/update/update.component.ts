import { Component, OnInit } from '@angular/core';
import { ProductServiceService } from '../product-service.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  selectedUser;
  products: any;

  constructor(private service: ProductServiceService, private route: Router) { }

  getDetails() {
   this.service.getData().subscribe(details => {
     this.products = details;
     console.log(this.products);

    });
   }
  selectUser(user) {
    alert('in ts component');
    console.log(user);
    this.selectedUser = user;
  }
  update(form: NgForm) {
    this.service.updateData(form.value).subscribe(resp => {
      form.reset();

    });
  }

  ngOnInit() {
  }

}
