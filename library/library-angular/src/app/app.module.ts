import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';

import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { UserComponent } from './user/user.component';
import { LibrarianComponent } from './librarian/librarian.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { AddbookComponent } from './addbook/addbook.component';
import { UpdateComponent } from './update/update.component';
import { DeleteComponent } from './delete/delete.component';
import { BooksListComponent } from './books-list/books-list.component';
import { BookRequestComponent } from './book-request/book-request.component';
import { AuthGuardService } from './auth-guard.service';
import { ReqListComponent } from './req-list/req-list.component';
import { ApproveListComponent } from './approve-list/approve-list.component';
import { FilterPipe } from './filter.pipe';
import { Filter2Pipe } from './filter2.pipe';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    RegisterComponent,
    UserComponent,
    LibrarianComponent,
    FooterComponent,
    HomeComponent,
    AddbookComponent,
    UpdateComponent,
    DeleteComponent,
    BooksListComponent,
    BookRequestComponent,
    ReqListComponent,
    ApproveListComponent,
    FilterPipe,
    Filter2Pipe,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'login', component : LoginComponent},
      {path : 'reg', component : RegisterComponent},
      {path : 'user', component : UserComponent,
    canActivate: [AuthGuardService], data: {type: ['user']}},
      {path : 'lib', component : LibrarianComponent,
      canActivate: [AuthGuardService], data: {type: ['lib']}},
      {path : 'home', component : HomeComponent},
      {path : 'add', component : AddbookComponent},
      {path : 'update', component : UpdateComponent},
      {path : 'list', component : BooksListComponent},
      {path : 'delete', component : DeleteComponent},
      {path : 'send', component : BookRequestComponent},
      {path : 'reqList', component : ReqListComponent},

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
