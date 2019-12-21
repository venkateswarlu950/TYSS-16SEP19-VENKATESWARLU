import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(User: any, search: any[]): any {
    if (search === undefined) {
      return User;

    } else {
      return User.filter((value, index, array) => {
        return value.bName.toLowerCase().includes(search.toLowerCase());
      });
    }
  }

}
