import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  loginUser(user): Observable<any> {
    return this.http.post(
      'http://localhost:8083/login',
      user);
  }

  addAsset(user): Observable<any> {
    return this.http.post('http://localhost:8083/addassest', user);
  }

  addEmployee(user): Observable<any> {
    return this.http.post('http://localhost:8083/addemployee', user);
  }

  updateAsset(user): Observable<any> {
    return this.http.post('http://localhost:8083/modifyassest', user);
  }
   
  raiseRequest(user): Observable<any> {
    return this.http.post('http://localhost:8083/raiserequest', user);
  }
   
  
}
