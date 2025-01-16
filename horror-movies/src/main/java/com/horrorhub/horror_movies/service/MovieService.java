package com.horrorhub.horror_movies.service;

import com.horrorhub.horror_movies.model.Movie;
import com.horrorhub.horror_movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie createMovie (Movie movie) {
        if (movieRepository.existsByTitle(movie.getTitle())) {
            throw new IllegalArgumentException("Movie already exists");
        }

        Movie newMovie = new Movie();
        newMovie.setTitle(movie.getTitle());
        newMovie.setDescription(movie.getDescription());
        newMovie.setYear(movie.getYear());
        newMovie.setDirector(movie.getDirector());
        newMovie.setGenres(movie.getGenres());

        return movieRepository.save(newMovie);

    }
}
