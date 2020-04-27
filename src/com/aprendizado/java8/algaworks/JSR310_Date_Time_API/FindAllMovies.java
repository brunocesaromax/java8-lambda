package com.aprendizado.java8.algaworks.JSR310_Date_Time_API;

import com.aprendizado.java8.algaworks.JSR310_Date_Time_API.repository.MovieRepository;

import java.time.format.DateTimeFormatter;

public class FindAllMovies {
    public static void main(String[] args) {
        MovieRepository movieRepository = new MovieRepository();

        movieRepository.findAll().forEach(movie -> {
            System.out.printf("%s - %s\n", movie.getName(), movie.getReleaseDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        });
    }
}
