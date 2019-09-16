import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Login } from  './Login';
import { Observable } from 'rxjs';
import { User } from './User';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  
  constructor(private http: HttpClient) { }

  
  
}
