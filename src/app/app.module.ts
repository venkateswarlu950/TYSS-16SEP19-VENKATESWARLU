import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { WebserverComponent } from './webserver/webserver.component';
import { MoviesapiComponent } from './webserver/moviesapi/moviesapi.component';
import { ReactiveComponent } from './reactive/reactive.component';
import { ModeldrivenComponent } from './modeldriven/modeldriven.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    WebserverComponent,
    MoviesapiComponent,
    ReactiveComponent,
    ModeldrivenComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: 'movies', component: MoviesapiComponent},
      {path: 'reactive', component: ReactiveComponent},
      {path: 'model', component: ModeldrivenComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
