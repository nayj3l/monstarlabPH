package com.example.monstarlab;

import com.example.monstarlab.movie.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@EnableJpaRepositories(basePackages = "com.example.monstarlab.movie")
@SpringBootApplication
public class MonstarlabApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonstarlabApplication.class, args);
	}

}
