import { Component, OnInit } from '@angular/core';
import { Movie } from './models/movie';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  movies: Movie[] = []


  ngOnInit(): void
  {
    console.log("call the API to get the movies");

    this.movies = [
      { order: 1, title: "Captain America" },
      { order: 2, title: "Captain Marvel" },
      { order: 3, title: "Iron Man" }
    ]
  }
}
