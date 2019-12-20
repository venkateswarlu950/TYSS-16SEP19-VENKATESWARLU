import { Component, OnInit } from '@angular/core';
import { ProductServiceService } from '../product-service.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-search-by-comp',
  templateUrl: './search-by-comp.component.html',
  styleUrls: ['./search-by-comp.component.css']
})
export class SearchByCompComponent implements OnInit {

  products: any;

  constructor(private service: ProductServiceService, private route: Router) { }

  getDetails(form: NgForm) {
   this.service.getDatacomp(form.value).subscribe(details => {
     this.products = details;
     console.log(this.products);

    });
   }


  ngOnInit() {
  }

}
