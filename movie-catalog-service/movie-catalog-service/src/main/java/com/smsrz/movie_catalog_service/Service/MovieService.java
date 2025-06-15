package com.smsrz.movie_catalog_service.Service;

import com.smsrz.movie_catalog_service.Entity.Movie;
import com.smsrz.movie_catalog_service.Repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepo repo;
    public List<Movie> saveAll(List<Movie> movies) {
        return repo.saveAll(movies);
    }

    public List<Movie> getAll() {
        return repo.findAll();
    }

    public String getbyId(long id) {
        Optional<Movie> movie = repo.findById(id);
        return movie.map(Movie::getPath).orElse(null);
    }
}
