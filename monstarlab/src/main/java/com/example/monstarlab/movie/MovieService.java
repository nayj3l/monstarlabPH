package com.example.monstarlab.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;
    private final FavoriteRepository favoriteRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository, FavoriteRepository favoriteRepository) {
        this.movieRepository = movieRepository;
        this.favoriteRepository = favoriteRepository;
    }

    public List<Movie> getMovies(){
        return movieRepository.findAll();
    }

    public Movie getMovie(long id){
        Optional<Movie> movie = movieRepository.findById(id);
        if(!movie.isPresent()){
            throw new IllegalStateException("Movie with id " + id + " does not exist");
        }
        return movie.get();
    }

    public List<Movie> searchMovies(String search){
        return movieRepository.searchMovies(search);
    }

    public void addFavorite(long movieId){
        Optional<Favorite> fav = favoriteRepository.findByMovieId(movieId);
        if(fav.isPresent()){
            throw new IllegalStateException("Movie already added in favorites");
        }

        Optional<Movie> movie = movieRepository.findById(movieId);
        if(!movie.isPresent()){
            throw new IllegalStateException("Movie with id " + movieId + " does not exist");
        }
        favoriteRepository.save(new Favorite(movie.get().getId(), new Date(),  1));
    }

    public List<Favorite> getFavorites(){
        return favoriteRepository.findAllFavorites();
    }

}
