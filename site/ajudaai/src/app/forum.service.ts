import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Thread } from './domain/thread';
import { Message } from './domain/message';
import { environment } from 'src/environments/environment';
import { OAuthService } from 'angular-oauth2-oidc';

@Injectable({
  providedIn: 'root'
})
export class ForumService {


  FORUM_API_ENDPOINT="https://gateway.wso2training.com/forum/1.0.0/forums";
  THREAD_API_ENDPOINT="https://gateway.wso2training.com/thread/1.0.0";
  environment = environment;

  constructor(
    private oauthService: OAuthService,
    private httpClient: HttpClient) {

  }

  public getForums(){
      // Http Headers
    var httpOptions = {
      headers: new HttpHeaders({
        'Accept': 'application/json',
        'Authorization': `Bearer ${this.oauthService.getAccessToken()}`
      })
    }
    return this.httpClient.get(`${this.FORUM_API_ENDPOINT}`, httpOptions);
  }

  public getThreads(){
    var httpOptions = {
      headers: new HttpHeaders({
        'Accept': 'application/json',
        'Authorization': `Bearer ${this.oauthService.getAccessToken()}`
      })
    }
    return this.httpClient.get(`${this.THREAD_API_ENDPOINT}/threads`, httpOptions);
  }

  public addThread(thread: Thread) {
    var httpOptions = {
      headers: new HttpHeaders({
        'Accept': 'application/json',
        'Authorization': `Bearer ${this.oauthService.getAccessToken()}`
      })
    }
    console.log( 'addThread');
    let url = `${this.THREAD_API_ENDPOINT}/thread`;
    console.log ('url ' + url );
    return this.httpClient.post<Thread>(url, thread, httpOptions);
  }

  addMessage(message: Message) {
    var httpOptions = {
      headers: new HttpHeaders({
        'Accept': 'application/json',
        'Authorization': `Bearer ${this.oauthService.getAccessToken()}`
      })
    }
    console.log( 'addMessage');
    let url = `${this.THREAD_API_ENDPOINT}/message`;
    console.log ('url ' + url );
    return this.httpClient.post<Message>(url, message, httpOptions);
  }

  public getThread( threadId: string ){
    var httpOptions = {
      headers: new HttpHeaders({
        'Accept': 'application/json',
        'Authorization': `Bearer ${this.oauthService.getAccessToken()}`
      })
    }
    return this.httpClient.get(`${this.THREAD_API_ENDPOINT}/thread/${threadId}`, httpOptions);
  }

  public getThreadMessages( threadId: string ){
    var httpOptions = {
      headers: new HttpHeaders({
        'Accept': 'application/json',
        'Authorization': `Bearer ${this.oauthService.getAccessToken()}`
      })
    }
    return this.httpClient.get(`${this.THREAD_API_ENDPOINT}/thread/${threadId}/messages`, httpOptions);
  }

}
