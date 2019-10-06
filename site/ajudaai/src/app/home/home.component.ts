import { Component, OnInit } from '@angular/core';
import { OAuthService, JwksValidationHandler } from 'angular-oauth2-oidc';
import { environment } from 'src/environments/environment';
import { authConfig } from '../auth.config';
import { User } from '../domain/user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  private environment = environment;
  user: User;

  constructor(    
    private oauthService: OAuthService,
    private userService: UserService
    ) { 
    
  }

  ngOnInit() {
    let _user = localStorage.getItem("user-ajudaai");
    if( _user ) {
      console.log( _user );
      this.configureWithNewConfigApi();
    } 
    if( localStorage.getItem("user") ) {
      this.user = JSON.parse(localStorage.getItem("user"));
      console.log( 'user ' + this.user );
    } else {
      if( localStorage.getItem("login") ) {
        localStorage.setItem("login", undefined);
        this.login();
      }
    }
  }

  ngAfterViewInit() {

  }

  private configureWithNewConfigApi() {
    this.oauthService.configure(authConfig);

    let self = this;
    this.oauthService.tokenValidationHandler = new JwksValidationHandler();
    this.oauthService.loadDiscoveryDocumentAndLogin({
      onTokenReceived: context => {
          self.environment.access_token = context.accessToken;
          console.log( "onTokenReceived - " + this.oauthService.getAccessToken());

          let email = undefined;
          if( this.oauthService.getIdentityClaims() ) {
            email = this.oauthService.getIdentityClaims()["email"];
          }

          var _user: User = JSON.parse(localStorage.getItem("user-ajudaai"));
          _user.email = email;
          this.userService.getUserByEmail( _user.email ).subscribe( 
            (data)=>{
              console.log(data);
              localStorage.setItem( "user", JSON.stringify(data) );
              this.user = _user;
            }, 
            error => {
              console.log('oops', error)
              if( error.status == 404) {
                this.userService.addUser( _user ).subscribe((data)=>{
                  console.log(data);
                  this.userService.getUserByEmail( _user.email ).subscribe( (data)=>{
                    console.log(data);
                    localStorage.setItem( "user", JSON.stringify(data) );
                    this.user = JSON.parse(JSON.stringify(data));
                  });
                });;              
              }
            }
          );;

          console.log( 'depois do addUser');
      }
    });

  }  

  login() {
    this.oauthService.configure(authConfig);
    localStorage.setItem("login", "true");

    let self = this;
    this.oauthService.tokenValidationHandler = new JwksValidationHandler();
    this.oauthService.loadDiscoveryDocumentAndLogin({
      onTokenReceived: context => {
        console.log('HOME - LOGIN - onTokenReceived')
        self.environment.access_token = context.accessToken;
        let email = undefined;
        if( this.oauthService.getIdentityClaims() ) {
          email = this.oauthService.getIdentityClaims()["email"];
        }
        this.userService.getUserByEmail( email ).subscribe( 
          (data)=>{
            console.log("HOME - LOGIN - OnTokenReceived - getUserByEmail - " + data);
            localStorage.setItem( "user", JSON.stringify(data) );
            this.user = JSON.parse( JSON.stringify(data) );
          }
        );
      }
    }).then( (res) => {
      console.log(res);
    });
  }
}
