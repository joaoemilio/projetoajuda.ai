import { Component, OnInit } from '@angular/core';
import { OAuthService, JwksValidationHandler } from 'angular-oauth2-oidc';
import { environment } from 'src/environments/environment';
import { authConfig } from '../auth.config';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  private environment = environment;

  constructor(    
    private oauthService: OAuthService,
    ) { 
    
  }

  ngOnInit() {
    let user = localStorage.getItem("user-ajudaai");
    if( user ) {
      console.log( user );
      this.configureWithNewConfigApi();
    }
  }

  ngAfterViewInit() {

  }

  private configureWithNewConfigApi() {
    this.oauthService.configure(authConfig);
    console.log( this.oauthService.getAccessToken());
    let self = this;
    this.oauthService.tokenValidationHandler = new JwksValidationHandler();
    this.oauthService.loadDiscoveryDocumentAndLogin({
      onTokenReceived: context => {
          self.environment.access_token = context.accessToken;
          console.log( this.oauthService.getAccessToken());

          let email = undefined;
          if( this.oauthService.getIdentityClaims() ) {
            email = this.oauthService.getIdentityClaims()["email"];
          }
          console.log( "loggedin: " + email );
      }
    });

  }  
}
