import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {NgForm} from '@angular/forms';
import { ForumService } from '../forum.service';
import { Thread } from '../domain/thread';
import { throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';

export interface DialogData {
  animal: string;
  name: string;
}

@Component({
  selector: 'app-new-thread-dialog',
  templateUrl: './new-thread-dialog.component.html',
  styleUrls: ['./new-thread-dialog.component.scss']
})
export class NewThreadDialogComponent implements OnInit {
  public mensagem: string;
  constructor(
    public forumService: ForumService,
    public dialogRef: MatDialogRef<NewThreadDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: DialogData) {}
  
  confirmSelection() {

  }

  onSubmit(form: NgForm) {
    let mensagem = form.controls['mensagem'].value;
    console.log('Your form data : ', form.value);
    console.log( mensagem );
    let thread: Thread = {
      id : undefined,
      descricao: undefined,
      idForum: undefined,
      user: undefined
    };
    this.forumService.addThread(thread).pipe( 
      retry(1), 
      catchError( this.errorHandl) 
    );
    this.dialogRef.close();
}

  ngOnInit() {
  }

  public sendMessage() {
  }

  public close() {
    this.dialogRef.close();
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
