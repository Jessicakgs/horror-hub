package com.horrorhub.horror_movies.controller;

import com.horrorhub.horror_movies.model.Movie;
import com.horrorhub.horror_movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/created")
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.createMovie(movie);
    }

    @GetMapping("/list")
    public List<Movie> getMovies() {
        return null; //MovieService.listMovies();
    }

    @GetMapping("/list/{id}")
    public Movie getMovie(@PathVariable int id) {
        return null;
    }

    @PutMapping("/edit/{id}")
    public Movie updateMovie(@PathVariable int id, @RequestBody Movie movie) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable int id) {
        return null;
    }
}
