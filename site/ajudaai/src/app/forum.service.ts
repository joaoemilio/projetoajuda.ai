import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Thread } from './domain/thread';
import { Message } from './domain/message';

@Injectable({
  providedIn: 'root'
})
export class ForumService {


  FORUM_API_ENDPOINT="https://gateway.wso2training.com/forum/1.0.0/forums";
  THREAD_API_ENDPOINT="https://gateway.wso2training.com/thread/1.0.0";
  API_ACCESS_TOKEN="b9b3ef64-7819-3652-8cdd-633621eb9db9";

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

  addMessage(message: Message) {
    console.log( 'addMessage');
    let url = `${this.THREAD_API_ENDPOINT}/message`;
    console.log ('url ' + url );
    return this.httpClient.post<Message>(url, message, this.httpOptions);
  }

  public getThread( threadId: string ){
    return this.httpClient.get(`${this.THREAD_API_ENDPOINT}/thread/${threadId}`, this.httpOptions);
  }

  public getThreadMessages( threadId: string ){
    return this.httpClient.get(`${this.THREAD_API_ENDPOINT}/thread/${threadId}/messages`, this.httpOptions);
  }

}
