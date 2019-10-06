import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ForumService } from '../forum.service';
import {NgForm} from '@angular/forms';
import { Thread } from '../domain/thread';
import { Message } from '../domain/message';
import { OAuthService } from 'angular-oauth2-oidc';
import { MatDialog } from '@angular/material';
import { NewReplyDialogComponent } from '../new-reply-dialog/new-reply-dialog.component';

@Component({
  selector: 'app-reply',
  templateUrl: './reply.component.html',
  styleUrls: ['./reply.component.scss']
})
export class ReplyComponent implements OnInit {
  id = "";
  thread;
  messages;

  constructor(
    private dialog: MatDialog,
    private oauthService: OAuthService,
    private forumService: ForumService, private _Activatedroute:ActivatedRoute){
    this.id=this._Activatedroute.snapshot.paramMap.get("id");
  }

  ngOnInit() {
    this.forumService.getThread(this.id).subscribe((data)=>{
      this.thread = data;
    });

    this.forumService.getThreadMessages(this.id).subscribe((data)=>{
      this.messages = data;
    });    
  }

  onSubmit(form: NgForm) {
    let mensagem = form.controls['mensagem'].value;

    let message: Message = {
      id : undefined,
      message: undefined,
      threadId: undefined,
      email: undefined
    };

    message.message = mensagem;
    message.threadId = this.id;
    message.email = this.oauthService.getIdentityClaims()["email"];

    this.forumService.addMessage(message).subscribe((data)=>{
      console.log(data);
    });
  }  

  openDialog(): void {
    let dialogRef = this.dialog.open(NewReplyDialogComponent, {
      height: '200px',
      width: '400px',
      data: { threadId: this.id }
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log( result );
      if( result != 'close') {
        console.log('enviou a mensagem');
      } else {
        console.log('fechou o dialog');
      }
    });
  }
}
