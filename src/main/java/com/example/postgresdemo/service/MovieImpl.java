package com.example.postgresdemo.service;

import com.example.postgresdemo.Model.Movie;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieImpl implements MovieInterface{

    private JdbcTemplate jdbcTemplate;

    MovieImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addMovie(Movie movie) {
        jdbcTemplate.update("INSERT INTO movies (title, vote_count, poster_path, movie_year) VALUES(?,?,?,?)",
                movie.getTitle(),
                movie.getVote_count(),
                movie.getPoster_path(),
                movie.getMovie_year());
    }

    @Override
    public List<Movie> findAll() {
        return jdbcTemplate.query("SELECT * FROM movies", BeanPropertyRowMapper.newInstance(Movie.class));
    }

    @Override
    public List<Movie> findAllByTitle(String title) {
        return List.of();
    }

    @Override
    public List<Movie> findAllByYear(int year) {
        return List.of();
    }

    @Override
    public List<Movie> findById(int id) {
        return List.of();
    }

    @Override
    public void deleteMovieById(int id) {

    }

    @Override
    public int updateMovie(Movie movie) {
        return 0;
    }

    @Override
    public void deleteAll() {

    }
}
