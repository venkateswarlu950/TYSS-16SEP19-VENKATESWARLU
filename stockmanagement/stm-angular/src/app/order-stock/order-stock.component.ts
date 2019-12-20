import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ProductServiceService } from '../product-service.service';

@Component({
  selector: 'app-order-stock',
  templateUrl: './order-stock.component.html',
  styleUrls: ['./order-stock.component.css']
})
export class OrderStockComponent implements OnInit {

  constructor(private serviice: ProductServiceService) { }

  saveOrder(form: NgForm) {
    this.serviice.addOrder(form.value).subscribe(res => {
      form.reset();
    });
  }

  ngOnInit() {
  }

}
