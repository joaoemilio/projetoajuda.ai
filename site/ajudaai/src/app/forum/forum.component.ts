import { Component, OnInit, Inject } from '@angular/core';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { NewThreadDialogComponent } from '../new-thread-dialog/new-thread-dialog.component';
import { ForumService } from '../forum.service';

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

  constructor(private forumService: ForumService, private dialog: MatDialog) { }

  ngOnInit() {
    this.forumService.getThreads().subscribe((data)=>{
      console.log(data);
      this.forums = data['threadCollection'].thread;
      console.log( this.forums);
    });
  }

  openDialog(): void {
    let dialogRef = this.dialog.open(NewThreadDialogComponent, {
      height: '200px',
      width: '400px',
    });
  }

  
}

