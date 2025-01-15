package com.horrorhub.horror_movies.controller;

import com.horrorhub.horror_movies.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {


    @PostMapping("/movies/{movieId}/reviews")
    public ResponseEntity<Review> addReview(@PathVariable int movieId, @RequestBody Review review) {
        return null;
    }

    @GetMapping("/movies/{movieId}/reviews")
    public ResponseEntity<List<Review>> getAllReviews(@PathVariable int movieId) {
        return null;
    }

    @GetMapping("/movies/{movieId}/{id}")
    public ResponseEntity<Review> getReview(@PathVariable int movieId, @PathVariable int id) {
        return null;
    }







}
