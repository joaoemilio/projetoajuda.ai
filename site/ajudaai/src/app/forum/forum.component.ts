import { Component, OnInit, Inject } from '@angular/core';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { NewThreadDialogComponent } from '../new-thread-dialog/new-thread-dialog.component';
import { ForumService } from '../forum.service';
import { UserService } from '../user.service';
import { User } from '../domain/user';

export interface DialogData {
  animal: string;
  name: string;
}

@Component({
  selector: 'app-forum',
  templateUrl: './forum.component.html',
  styleUrls: ['./forum.component.scss']
})
export class ForumComponent implements OnInit {

  forums;
  public mensagem: string;

  constructor(
    private forumService: ForumService, 
    private userService: UserService, 
    private dialog: MatDialog) { }

  ngOnInit() {
    this.forumService.getThreads().subscribe((data)=>{
      this.forums = data;
      this.forums.forEach(element => {
        console.log( element.id );
        this.userService.getUser( element.userId ).subscribe( (data) => {
          let user: any = data;
          element.avatar = user.avatar;
          element.apelido = user.apelido;
          console.log( element.avatar + ' ' + element.apelido );
        });
      });
    });
  }

  openDialog(): void {
    let dialogRef = this.dialog.open(NewThreadDialogComponent, {
      height: '200px',
      width: '400px',
    });
  }

  
}

