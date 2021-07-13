package com.example.monstarlab.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "api/v1")
public class MovieController {

    private final MovieService movieService;
    private final MovieRepository movieRepository;
    private final String API_KEY = "qwer123";

    @Autowired
    public MovieController(MovieService movieService, MovieRepository movieRepository) {
        this.movieService = movieService;
        this.movieRepository = movieRepository;
    }

    @GetMapping(value="/movies")
    public List<Movie> getMovies(
            @RequestParam(required=false, name = "search") String search,
            @RequestParam(required=false, name = "apikey") String apiKey){
        if(search != null && search.length() > 0){
            if(apiKey == null || apiKey.length() == 0 || !apiKey.equals(API_KEY)){
                throw new IllegalStateException("Please provide a valid API Key");
            }
            return movieService.searchMovies(search);
        }
        return movieService.getMovies();
    }

    @GetMapping(value = "/movies/{id}")
    public Movie getMovie(
            @PathVariable(name = "id") long id,
            @RequestParam(name = "apikey") String apiKey){
        if(apiKey == null || apiKey.length() == 0 || !apiKey.equals(API_KEY)){
            throw new IllegalStateException("Please provide a valid API Key");
        }
        return movieService.getMovie(id);
    }

    @PostMapping(value = "/favorites/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Object> addToFavorite(@PathVariable(name = "id") long movieId){
        movieService.addFavorite(movieId);
        Map<String, Object> json = new LinkedHashMap<>();
        json.put("message", "Movie successfully added to your favorites");
        json.put("status", "success");
        return json;
    }

    @GetMapping(value = "/favorites")
    public List<Favorite> getFavorites(){
        return movieService.getFavorites();
    }

}
