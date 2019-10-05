import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Thread } from './domain/thread';

@Injectable({
  providedIn: 'root'
})
export class ForumService {

  FORUM_API_ENDPOINT="https://gateway.wso2training.com/forum/1.0.0/forums";
  THREAD_API_ENDPOINT="https://gateway.wso2training.com/thread";
  API_ACCESS_TOKEN="b825e78d-921b-38a6-b652-d56db1a50c26";

  // Http Headers
  httpOptions = {
    headers: new HttpHeaders({
      'Accept': 'application/json',
      'Authorization': `Bearer ${this.API_ACCESS_TOKEN}`
    })
  }

  constructor(private httpClient: HttpClient) {

  }

  public getForums(){
    return this.httpClient.get(`${this.FORUM_API_ENDPOINT}`, this.httpOptions);
  }

  public getThreads(){
    return this.httpClient.get(`${this.THREAD_API_ENDPOINT}/threads`, this.httpOptions);
  }

  public addThread(thread: Thread) {
    console.log( 'addThread');
    let url = `${this.THREAD_API_ENDPOINT}/thread`;
    console.log ('url ' + url );
    return this.httpClient.post<Thread>(url, thread, this.httpOptions);
  }
}
