import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})


export class ItemService {

  constructor(private httpClient : HttpClient) { }

  private baseUrl = "http://localhost:8080/item/item"

  public getAllItems():Observable<any>{
    
    return this.httpClient.get(`${this.baseUrl}`);
  }

  public deletItem (id:number) : Observable<any>{
    console.log(`${this.baseUrl}/${id}`)
    return this.httpClient.delete(`${this.baseUrl}/${id}` , { responseType: 'text' });
  }
}
