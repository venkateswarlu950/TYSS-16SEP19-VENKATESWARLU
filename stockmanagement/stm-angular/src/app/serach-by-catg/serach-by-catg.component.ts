import { Component, OnInit } from '@angular/core';
import { ProductServiceService } from '../product-service.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-serach-by-catg',
  templateUrl: './serach-by-catg.component.html',
  styleUrls: ['./serach-by-catg.component.css']
})
export class SerachByCatgComponent implements OnInit {

  products: any;

  constructor(private service: ProductServiceService, private route: Router) { }

  getDetails(form: NgForm) {
   this.service.getDatacatg(form.value).subscribe(details => {
     this.products = details;
     console.log(this.products);

    });
   }

  ngOnInit() {
  }

}
