import { Component } from '@angular/core';
import { faCoffee, faHome, faHeart, faComment } from '@fortawesome/free-solid-svg-icons';
import { faInstagram } from '@fortawesome/free-brands-svg-icons';

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
}
