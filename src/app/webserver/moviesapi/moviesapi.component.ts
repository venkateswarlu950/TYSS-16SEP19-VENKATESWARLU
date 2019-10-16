import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-moviesapi',
  templateUrl: './moviesapi.component.html',
  styleUrls: ['./moviesapi.component.css']
})
export class MoviesapiComponent implements OnInit {

movie: any;
  movies;

  constructor(public http: HttpClient) {

   }


  ngOnInit() {
  }
  showMovies(event) {
    console.log(event.target.value);
    this.movie = event.target.value;
    this.http.get<any>('http://www.omdbapi.com/?apikey=afeb9f99&s=' + this.movie).subscribe (data => {
      this.movies = data.Search;
    }, err => {
      console.log(err);
    }, () => {
      console.log('movies get sucessfully');
    });
  }
}
