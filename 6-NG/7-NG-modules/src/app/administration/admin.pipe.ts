import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'adminPipe'
})
export class AdminPipe implements PipeTransform {

  transform(value: any, args?: any): any {
    return value.toUpperCase();
  }

}
