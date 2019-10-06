import { Component } from '@angular/core';
import { faCoffee, faHome, faHeart, faComment } from '@fortawesome/free-solid-svg-icons';
import { faInstagram } from '@fortawesome/free-brands-svg-icons';
import { OAuthService } from 'angular-oauth2-oidc';
import { JwksValidationHandler } from 'angular-oauth2-oidc';
import { authConfig } from './auth.config';
import { environment } from '../environments/environment';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'ajudaai';
  faCoffee = faCoffee;
  faHome = faHome;
  faHeart = faHeart;
  faInstagram = faInstagram;
  faComment = faComment;
  constructor( private oauthService: OAuthService) {
      //this.configureWithNewConfigApi();
  }

}
