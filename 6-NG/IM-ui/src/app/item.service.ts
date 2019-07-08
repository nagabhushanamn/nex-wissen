import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  constructor(private _http: HttpClient) { }

  loadItems() {
    let api = "http://localhost:8181/api/products"
    return this._http.get(api);
  }
  loadItem(id) {
    let api = `http://localhost:8181/api/products/${id}`
    return this._http.get(api);
  }
  saveItem(item) {
    let api = "http://localhost:8181/api/products"
    if (!item.id) {
      return this._http.post(api, item);
    } else {
      return this._http.put(api + `/${item.id}`, item);
    }
  }
}
