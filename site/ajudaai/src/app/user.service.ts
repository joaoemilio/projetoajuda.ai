import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from './domain/user';
import { environment } from 'src/environments/environment';
import { OAuthService } from 'angular-oauth2-oidc';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  environment = environment;

  USER_API_ENDPOINT="https://gateway.wso2training.com/user/1.0.0";

  constructor(
    private oauthService: OAuthService,
    private httpClient: HttpClient) {

  }

  public addUser(user: User) {
    console.log('addUser ' + this.oauthService.getAccessToken() );
      // Http Headers
    var httpOptions = {
      headers: new HttpHeaders({
        'Accept': 'application/json',
        'Authorization': `Bearer ${this.oauthService.getAccessToken()}`
      })
    }

    let url = `${this.USER_API_ENDPOINT}/user`;
    return this.httpClient.post<User>(url, user, httpOptions);        

  }

  public getUser( userId: string ){
    var httpOptions = {
      headers: new HttpHeaders({
        'Accept': 'application/json',
        'Authorization': `Bearer ${this.oauthService.getAccessToken()}`
      })
    }

    return this.httpClient.get(`${this.USER_API_ENDPOINT}/user/${userId}`, httpOptions);
  }


  public getUserByEmail( email: string ){
    var httpOptions = {
      headers: new HttpHeaders({
        'Accept': 'application/json',
        'Authorization': `Bearer ${this.oauthService.getAccessToken()}`
      })
    }

    return this.httpClient.get(`${this.USER_API_ENDPOINT}/user?email=${email}`, httpOptions);
  }
}
