import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { UserService } from './user.service';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  constructor(private _http: HttpClient, private userService: UserService) { }


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
    let httpOptions = {
      headers: new HttpHeaders({
        "Authorization": `Bearer ${this.userService.getUserAuthToken()}`
      })
    }
    return this._http.post(apiUrl, review, httpOptions)
  }

}
