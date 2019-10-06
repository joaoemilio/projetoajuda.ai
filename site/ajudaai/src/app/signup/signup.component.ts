import { Component, OnInit, ElementRef, Inject } from '@angular/core';
import { Avatar } from '../domain/avatar';
import { DOCUMENT } from '@angular/common';
import { faFacebook } from '@fortawesome/free-brands-svg-icons';
import { MatDialog } from '@angular/material';
import { AlertDialogComponent } from '../alert-dialog/alert-dialog.component';
import { User } from '../domain/user';
import { OAuthService, JwksValidationHandler } from 'angular-oauth2-oidc';
import { authConfig } from '../auth.config';
import { environment } from '../../environments/environment';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})
export class SignupComponent implements OnInit {

  faFacebook = faFacebook;
  environment = environment;

  avatar: Avatar = {
    id: undefined,
    url: undefined
  };

  apelido: string;

  avatars: Avatar[] = [
    { id: 1, url: 'assets/light1.imageset/light1.png' },
    { id: 2, url: 'assets/light2.imageset/light2.png' },
    { id: 3, url: 'assets/light3.imageset/light3.png' },
    { id: 4, url: 'assets/light4.imageset/light4.png' },
    { id: 5, url: 'assets/light5.imageset/light5.png' },
    { id: 6, url: 'assets/light6.imageset/light6.png' },
    { id: 7, url: 'assets/light7.imageset/light7.png' },
    { id: 8, url: 'assets/light8.imageset/light8.png' },
    { id: 9, url: 'assets/light9.imageset/light9.png' },
    { id: 10, url: 'assets/light10.imageset/light10.png' },
    { id: 11, url: 'assets/light11.imageset/light11.png' },
    { id: 12, url: 'assets/light12.imageset/light12.png' },
    { id: 13, url: 'assets/light13.imageset/light13.png' },
    { id: 14, url: 'assets/light14.imageset/light14.png' },
    { id: 15, url: 'assets/light15.imageset/light15.png' },
    { id: 16, url: 'assets/light16.imageset/light16.png' },
    { id: 17, url: 'assets/light17.imageset/light17.png' },
    { id: 18, url: 'assets/light18.imageset/light18.png' },
    { id: 19, url: 'assets/light19.imageset/light19.png' },
    { id: 20, url: 'assets/light20.imageset/light20.png' },
    { id: 21, url: 'assets/light21.imageset/light21.png' },
    { id: 22, url: 'assets/light22.imageset/light22.png' },
    { id: 23, url: 'assets/light23.imageset/light23.png' },
    { id: 24, url: 'assets/light24.imageset/light24.png' },
    { id: 25, url: 'assets/light25.imageset/light25.png' },
    { id: 26, url: 'assets/light26.imageset/light26.png' }
  ];
  constructor(    private dialog: MatDialog,
    private oauthService: OAuthService,
      @Inject(DOCUMENT) document) { }

  ngOnInit() {
  }

  chooseAvatar( event: any, id: number) {
    console.log( 'event ' + event.target.src + ' current ' + this.avatar.id + ' new ' + id);
    var img: any = document.getElementById( "" + id );

    if( this.avatar.id != id ) {
      img.src = `assets/dark${id}.imageset/dark${id}.png`;
      img.class = 'yellow';

      if( this.avatar.id != undefined ) {
        var imgOld: any = document.getElementById( "" + this.avatar.id );
        imgOld.src = `assets/light${this.avatar.id}.imageset/light${this.avatar.id}.png`;
      }

      this.avatar.id = id;
    } else {
      img.src = `assets/light${this.avatar.id}.imageset/light${this.avatar.id}.png`;
      this.avatar.id = undefined;
    }
  }

  alert(_message: string): void {
    let dialogRef = this.dialog.open(AlertDialogComponent, {
      height: '200px',
      width: '400px',
      data: { message: _message }
    });
  }  

  registrar() {

    if( this.avatar.id == undefined ) {
      this.alert( "Por favor, escolha um avatar. :-)");
      return;
    }

    if( this.apelido == undefined || this.apelido == '' || this.apelido.length < 3) {
      this.alert( "Por favor, escolha um Apelido com pelo menos 3 letras. :-)");
      return;
    }
    let user: User = {
      id: undefined,
      email: undefined,
      avatar: this.avatar.id,
      photo: this.avatar.url,
      apelido: this.apelido
    }
    localStorage.setItem( "user-ajudaai", JSON.stringify(user));
    this.oauthService.configure(authConfig);
    let self = this;
    this.oauthService.tokenValidationHandler = new JwksValidationHandler();
    this.oauthService.loadDiscoveryDocumentAndLogin({
      onTokenReceived: context => {
          self.environment.access_token = context.accessToken;
          console.log( "SignUP - onTokenReceived: " + self.environment.access_token);
      }
    });
  }

}
