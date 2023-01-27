package com.Review_Zone.services;
import com.Review_Zone.models.Movie;
import com.Review_Zone.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public List<Movie> findAllMovies() {
        return repository.findAll();
    }
    public Optional<Movie> findMovieByImdbId(String imdbId) {
        return repository.findMovieByImdbId(imdbId);
    }
}
