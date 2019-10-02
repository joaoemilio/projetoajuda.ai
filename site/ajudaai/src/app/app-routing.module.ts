import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { InstagramComponent } from './instagram/instagram.component';
import { HomeComponent } from './home/home.component';
import { EuComponent } from './eu/eu.component';
import { ForumComponent } from './forum/forum.component';

const routes: Routes = [
  { path: '', component: HomeComponent}, 
  { path: 'instagram', component: InstagramComponent},
  { path: 'eu', component: EuComponent},
  { path: 'forum', component: ForumComponent}
];

export const appRoutingModule = RouterModule.forRoot(routes);

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
