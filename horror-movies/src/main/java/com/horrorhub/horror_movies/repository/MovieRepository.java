package com.horrorhub.horror_movies.repository;

import com.horrorhub.horror_movies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    boolean existsByTitle(String title);
}
