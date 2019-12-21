import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {


  public  isLibLoggedIn = false;
  public  isUserLoggedIn = false;

  constructor(private http: HttpClient) { }
  registerUser(user): Observable<any> {

    return this.http.post('http://localhost:8080/librarymanagement/reg', user);

  }

  loginUser(login): Observable<any> {

  return this.http.post('http://localhost:8080/librarymanagement/login', login);

  }

  bookAdd(add): Observable<any> {

    return this.http.post('http://localhost:8080/librarymanagement/addBook', add);
  }

  getData(): Observable<any> {

    return this.http.get('http://localhost:8080/librarymanagement/getList');
  }

  updateUser(details): Observable<any> {

    return this.http.put('http://localhost:8080/librarymanagement/update', details);
  }
  deleteUser(bid): Observable<any> {
    console.log('in service', bid);
    return this.http.delete(`${'http://localhost:8080/librarymanagement/delete'}/${bid}`);
  }

  request(user): Observable<any> {

    return this.http.post('http://localhost:8080/librarymanagement/req', user);
  }

  requestData(data): Observable<any> {

    return this.http.post('http://localhost:8080/librarymanagement/request', data);
  }
  reqList(): Observable<any> {

    return this.http.get('http://localhost:8080/librarymanagement/reqList');
  }
  approve(approveData): Observable<any> {
    console.log('in service', approveData);

    return this.http.post('http://localhost:8080/librarymanagement/approve', approveData);
  }

  reject(id): Observable<any> {
    console.log('in service', id);
    return this.http.delete(`${'http://localhost:8080/librarymanagement/reject'}/${id}`);
  }

  islibrarianLoggedIn() {
    if (this.isLibLoggedIn) {
      return true;
    } else {
      return false;
    }
  }
  isUserlogIn() {
    if (this.isUserLoggedIn) {
      return true;
    } else {
      return false;
    }
  }

}
