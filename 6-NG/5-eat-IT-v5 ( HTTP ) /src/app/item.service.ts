import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  constructor(private _http: HttpClient) { }


  getItems() {
    let apiUrl = "http://localhost:8081/api/v1/items";
    return this._http.get(apiUrl) // async
  }
  getReviews(id) {
    let apiUrl = `http://localhost:8081/api/v1/items/${id}/reviews`;
    return this._http.get(apiUrl) // async
  }
  postReview(itemId, review) {
    let apiUrl = `http://localhost:8081/api/v1/items/${itemId}/reviews`;
    return this._http.post(apiUrl, review) // async
  }

}
