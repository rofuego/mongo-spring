package cl.sourcecode.movies.api.service;

import cl.sourcecode.movies.api.model.Movie;
import cl.sourcecode.movies.api.repository.MovieRepository;
import org.bson.types.ObjectId;
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
