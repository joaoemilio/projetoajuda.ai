import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {NgForm} from '@angular/forms';

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
    public dialogRef: MatDialogRef<NewThreadDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: DialogData) {}
  
  confirmSelection() {

  }

  onSubmit(form: NgForm) {
    console.log('Your form data : ', form.value);
    console.log( form.controls['mensagem'].value );
    this.dialogRef.close();
}

  ngOnInit() {
  }

  public sendMessage() {
  }

  public close() {
    this.dialogRef.close();
  }

}
