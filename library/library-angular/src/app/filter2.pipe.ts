import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter2'
})
export class Filter2Pipe implements PipeTransform {

  transform(User: any, search: any[]): any {
    if (search === undefined) {
      return User;

    } else {
      return User.filter((value, index, array) => {
        return value.bookName.toLowerCase().includes(search.toLowerCase());
      });
    }
  }

}
