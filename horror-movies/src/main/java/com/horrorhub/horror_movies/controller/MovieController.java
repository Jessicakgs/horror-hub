package com.horrorhub.horror_movies.controller;

import com.horrorhub.horror_movies.model.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/movie")
public class MovieController {

    @PostMapping("/created")
    public String createMovie(@RequestBody Movie movie) {
        return null; //MovieService.createdMovie("Created");
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
