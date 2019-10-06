import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {NgForm} from '@angular/forms';
import { ForumService } from '../forum.service';
import { Thread } from '../domain/thread';
import { throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';
import { OAuthService } from 'angular-oauth2-oidc';


@Component({
  selector: 'app-new-thread-dialog',
  templateUrl: './new-thread-dialog.component.html',
  styleUrls: ['./new-thread-dialog.component.scss']
})
export class NewThreadDialogComponent implements OnInit {
  public mensagem: string;
  constructor(
    public forumService: ForumService,
    public oauthService: OAuthService,
    public dialogRef: MatDialogRef<NewThreadDialogComponent>) {}
  
  confirmSelection() {

  }

  onSubmit() {
  }

  ngOnInit() {
  }

  public sendMessage() {
    let thread: Thread = {
      id : undefined,
      descricao: undefined,
      idForum: undefined,
      user: undefined
    };

    thread.descricao = this.mensagem;

    this.forumService.addThread(thread).subscribe((data)=>{
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
