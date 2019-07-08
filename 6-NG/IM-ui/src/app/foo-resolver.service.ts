import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FooResolverService {
  resolve() {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        resolve('FOOOOOO')
      }, 0)
    });
  }

}
