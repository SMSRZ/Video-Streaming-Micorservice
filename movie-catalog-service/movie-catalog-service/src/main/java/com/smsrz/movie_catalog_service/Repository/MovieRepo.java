package com.smsrz.movie_catalog_service.Repository;

import com.smsrz.movie_catalog_service.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie,Long> {
}
