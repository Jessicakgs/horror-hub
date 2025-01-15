package com.horrorhub.horror_movies.controller;

import com.horrorhub.horror_movies.model.Genre;
import com.horrorhub.horror_movies.model.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GenreController {

    @PostMapping("/created")
    public String createdGenre (@RequestBody Genre genre) {
        return genre.toString();
    }

    @GetMapping("/genres")
    public List<Genre> getAllGenres() {
        return null;
    }

    @GetMapping("/genres/{id}/movies")
    public List<Movie> getAllMovies(@PathVariable int id) {
        return null;
    }

}
