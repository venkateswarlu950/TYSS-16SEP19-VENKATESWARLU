import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {

  constructor(private http: HttpClient) { }
  addStock(product): Observable<any> {

    return this.http.post('http://localhost:8080/save', product);

  }

  getDataName(name): Observable<any> {
    console.log('byname', name);
    return this.http.get(`${'http://localhost:8080/searchName'}/${name}`);
}
getDatacatg(catg): Observable<any> {

  return this.http.get('http://localhost:8080/searchName', catg);
}
getDatacomp(comp): Observable<any> {

  return this.http.get('http://localhost:8080/searchName', comp);
}
updateData(details): Observable<any> {

  return this.http.get('http://localhost:8080/update', details);
}
getData(): Observable<any> {

  return this.http.get('http://localhost:8080/getProduts');
}
addOrder(order): Observable<any> {

  return this.http.get('http://localhost:8080/orderSave', order);
}
}
