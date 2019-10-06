import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {NgForm} from '@angular/forms';
import { ForumService } from '../forum.service';
import { Thread } from '../domain/thread';
import { throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';
import { OAuthService } from 'angular-oauth2-oidc';
import { Message } from '../domain/message';

@Component({
  selector: 'app-new-reply-dialog',
  templateUrl: './new-reply-dialog.component.html',
  styleUrls: ['./new-reply-dialog.component.scss']
})
export class NewReplyDialogComponent implements OnInit {

  public mensagem: string;

  constructor(
    public forumService: ForumService,
    public oauthService: OAuthService,
    public dialogRef: MatDialogRef<NewReplyDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any) {}

  onSubmit(form: NgForm) {

  }

  ngOnInit() {
  }

  public sendMessage() {

    console.log( "mensagem: " + this.mensagem );

    let message: Message = {
      id : undefined,
      message: undefined,
      threadId: undefined,
      email: undefined
    };

    message.message = this.mensagem;
    message.threadId = this.data.threadId;
    message.email = this.oauthService.getIdentityClaims()["email"];

    this.forumService.addMessage(message).subscribe((data)=>{
      console.log(data);
    });  

    this.dialogRef.close('sent');

  }

  public close() {
    this.dialogRef.close('close');
  }

  // Error handling
  errorHandl(error) {
    let errorMessage = '';
    if(error.error instanceof ErrorEvent) {
      // Get client-side error
      errorMessage = error.error.message;
    } else {
      // Get server-side error
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    console.log(errorMessage);
    return throwError(errorMessage);
  }

}
