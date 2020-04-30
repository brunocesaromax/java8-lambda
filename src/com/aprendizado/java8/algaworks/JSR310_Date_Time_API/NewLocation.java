package com.aprendizado.java8.algaworks.JSR310_Date_Time_API;

import com.aprendizado.java8.algaworks.JSR310_Date_Time_API.model.Customer;
import com.aprendizado.java8.algaworks.JSR310_Date_Time_API.model.Location;
import com.aprendizado.java8.algaworks.JSR310_Date_Time_API.model.Movie;
import com.aprendizado.java8.algaworks.JSR310_Date_Time_API.repository.MovieRepository;

import java.util.Arrays;
import java.util.List;

public class NewLocation {

    public static void main(String[] args) {
        MovieRepository movieRepository = new MovieRepository();
        List<Movie> rentedMovies = Arrays.asList(movieRepository.findByIndex(0), movieRepository.findByIndex(1));

        Location location = new Location(rentedMovies, new Customer("Kratos"));

        location.printReceipt();
    }
}
