package com.example.monstarlab.movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query("SELECT name FROM Movie m WHERE m.name = ?1")
    Optional<Movie> findMovieByName(String name);

    @Query("SELECT m FROM Movie m WHERE m.name like %:name%")
    List<Movie> searchMovies(String name);

}
