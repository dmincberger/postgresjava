package com.example.postgresdemo.Model;

public class Movie {
    private String title;
    private int vote_count;
    private String poster_path;
    private int movie_year;

    public Movie(String title, int vote_count, String poster_path, int movie_year) {
        this.title = title;
        this.vote_count = vote_count;
        this.poster_path = poster_path;
        this.movie_year = movie_year;
    }

    public String getTitle() {
        return title;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public int getMovie_year() {
        return movie_year;
    }

    public int getVote_count() {
        return vote_count;
    }
}
