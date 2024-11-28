package com.example.postgresdemo.service;

import com.example.postgresdemo.Model.Movie;

import java.util.List;

public interface MovieInterface {
    void addMovie(Movie movie);
    List<Movie> findAll();
    List<Movie> findAllByTitle(String title);
    List<Movie> findAllByYear(int year);
    List<Movie> findById(int id);
    void deleteMovieById(int id);
    int updateMovie(Movie movie);
    void deleteAll();
}
