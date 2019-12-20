import { Component, OnInit } from '@angular/core';
import { ProductServiceService } from '../product-service.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  constructor(private service: ProductServiceService, private route: Router) { }

  addProduct(form: NgForm) {
  console.log('product values', form.value);
  this.service.addStock(form.value).subscribe(resp => {
    console.log('values here', form.value);
    console.log(resp);
    if (resp !== null) {
      alert('product Adding Succesfull');
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
