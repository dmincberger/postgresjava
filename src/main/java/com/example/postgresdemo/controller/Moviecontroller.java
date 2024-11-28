package com.example.postgresdemo.controller;

import com.example.postgresdemo.Model.Movie;
import com.example.postgresdemo.messages.Message;
import com.example.postgresdemo.service.MovieImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
public class Moviecontroller {

    private final MovieImpl movieService;

    public Moviecontroller(MovieImpl movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/movie")
    public ResponseEntity<Message> createMovie(@RequestBody Movie movie) {

        System.out.println("new movie = " + movie);
        try {
            movieService.addMovie(movie);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(new Message("Movie was created successfully." + movie.getTitle()));
        } catch (Exception e) {
            System.out.println("błąd: " + e.getMessage());
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(new Message(e.getMessage()));

        }
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getMovies() {
        List<Movie> moviesList = movieService.findAll();
        return ResponseEntity
                .status(200)
                .body(moviesList);
    }
}
