package com.smsrz.movie_streaming_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "MOVIE-CATALOG-SERVICE")
public interface Client {
    /*@PostMapping("saveAll")
    public List<Movie> saveAll(@RequestBody List<Movie> movies);
    @GetMapping("getAll")
    public List<Movie> getMovie();*/
    @GetMapping("movie/get/{id}")
    public String findPath(@PathVariable long id);
}
