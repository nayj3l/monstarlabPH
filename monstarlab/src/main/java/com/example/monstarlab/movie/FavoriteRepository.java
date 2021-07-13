package com.example.monstarlab.movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Long> {

    @Query("SELECT f FROM Favorite f ORDER BY date_added desc")
    List<Favorite> findAllFavorites();

    @Query("SELECT f FROM Favorite f WHERE movie_id = :movieId")
    Optional<Favorite> findByMovieId(Long movieId);
}
