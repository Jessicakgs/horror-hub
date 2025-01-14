package com.horrorhub.horror_movies.model;

import jakarta.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserHub user;

    private int rating;

    private String comment;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserHub getUser() {
        return user;
    }

    public void setUser(UserHub user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
