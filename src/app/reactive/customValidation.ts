import { AbstractControl, ValidationErrors } from '@angular/forms';





export class CustomValidation {

    constructor() {}
    static unique(control: AbstractControl): ValidationErrors | null {
     if (control.value === 'milana') {
         return {unique: true};
     } else {
         return null;
     }
    }

}
