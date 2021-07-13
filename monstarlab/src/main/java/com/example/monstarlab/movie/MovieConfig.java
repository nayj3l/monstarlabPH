package com.example.monstarlab.movie;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MovieConfig {

    @Bean
    CommandLineRunner commandLineRunner(MovieRepository movieRepository){
        return args -> {
            Movie m1 = new Movie("Ror1", 2020);
            Movie m2 = new Movie("Ror2", 2021);

//            movieRepository.saveAll(
//                    List.of(m1, m2)
//            );
        };
    }

}
