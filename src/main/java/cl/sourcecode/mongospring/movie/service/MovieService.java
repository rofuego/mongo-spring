package cl.sourcecode.mongospring.movie.service;

import cl.sourcecode.mongospring.movie.model.Movie;
import cl.sourcecode.mongospring.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Movie getMovie(String id) { return movieRepository.findMovieByImdbId(id).get();}
}
