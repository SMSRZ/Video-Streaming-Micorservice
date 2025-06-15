package com.smsrz.movie_catalog_service.Controller;


import com.smsrz.movie_catalog_service.Entity.Movie;
import com.smsrz.movie_catalog_service.Repository.MovieRepo;
import com.smsrz.movie_catalog_service.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movie")
public class MovieController {

    @Autowired
    private MovieService service;
    @PostMapping("saveAll")
    public List<Movie> saveAll(@RequestBody List<Movie> movies){
        return service.saveAll(movies);
    }
    @GetMapping("getAll")
    public List<Movie> getMovie(){
        return service.getAll();
    }
    @GetMapping("get/{id}")
    public String findPath(@PathVariable long id){
        return service.getbyId(id);
    }
}
