import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { ReactiveComponent } from './reactive/reactive.component';
import { ModeldrivenComponent } from './modeldriven/modeldriven.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { ProductComponent } from './product/product.component';
import { SearchStockComponent } from './search-stock/search-stock.component';
import { SearchByNameComponent } from './search-by-name/search-by-name.component';
import { SerachByCatgComponent } from './serach-by-catg/serach-by-catg.component';
import { SearchByCompComponent } from './search-by-comp/search-by-comp.component';
import { OrderStockComponent } from './order-stock/order-stock.component';
import { UpdateComponent } from './update/update.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ReactiveComponent,
    ModeldrivenComponent,
    ProductComponent,
    SearchStockComponent,
    SearchByNameComponent,
    SerachByCatgComponent,
    SearchByCompComponent,
    OrderStockComponent,
    UpdateComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: 'reactive', component: ReactiveComponent},
      {path: 'model', component: ModeldrivenComponent},
      {path: 'addProduct', component: ProductComponent},
      {path: 'searchByName', component: SearchByNameComponent},
      {path: 'searchByCatg', component: SerachByCatgComponent},
      {path: 'searchByComp', component: SearchByCompComponent},
      {path: 'search', component: SearchStockComponent},
      {path: 'order', component: OrderStockComponent},
      {path: 'update', component: UpdateComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
