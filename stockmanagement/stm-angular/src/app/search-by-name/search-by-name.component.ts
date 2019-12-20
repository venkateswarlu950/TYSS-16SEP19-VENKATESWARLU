import { Component, OnInit } from '@angular/core';
import { ProductServiceService } from '../product-service.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-search-by-name',
  templateUrl: './search-by-name.component.html',
  styleUrls: ['./search-by-name.component.css']
})
export class SearchByNameComponent implements OnInit {
  products: any;

  constructor(private service: ProductServiceService, private route: Router) { }

  getDetails(form: NgForm) {
    console.log('byname', form.value);
    this.service.getDataName(form.value).subscribe(details => {
     this.products = details;
     console.log(this.products);

    });
   }

  ngOnInit() {
  }

}
