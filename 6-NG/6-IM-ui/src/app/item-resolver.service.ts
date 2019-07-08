import { Injectable } from '@angular/core';
import { ItemService } from './item.service';
import { ActivatedRouteSnapshot, RouterStateSnapshot, Resolve } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ItemResolverService implements Resolve<any> {
  constructor(private itemService: ItemService) { }
  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<any> | Promise<any> | any {
    console.log('resolving...')
    return this.itemService.loadItem(route.params.itemId);
  }
}
