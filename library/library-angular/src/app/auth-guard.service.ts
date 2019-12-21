import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot } from '@angular/router';


@Injectable({
  providedIn: 'root'
})
export class AuthGuardService implements CanActivate  {

  canActivate(route: ActivatedRouteSnapshot): boolean {
    const expectedRoleArray = route.data.type;
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    let expectedRole: string;
    for (const index in expectedRoleArray) {
        if (userDetails && userDetails.type === expectedRoleArray[index]) {
            expectedRole = expectedRoleArray[index];
        }
    }
    if (userDetails && expectedRole === userDetails.type) {
        console.log('user authenticated');
        return true;
    } else {
        console.log('not authenticated');
        return false;
    }
}

  constructor() { }
}
