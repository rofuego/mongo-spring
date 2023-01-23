package cl.sourcecode.mongospring.movie.controller;

import cl.sourcecode.mongospring.movie.model.Movie;
import cl.sourcecode.mongospring.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("")
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable String id) {
        return new ResponseEntity<>(movieService.getMovie(id), HttpStatus.OK);
    }

}
