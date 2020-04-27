package com.aprendizado.java8.algaworks.JSR310_Date_Time_API.repository;

import com.aprendizado.java8.algaworks.JSR310_Date_Time_API.model.Movie;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class MovieRepository {
    private static Movie[] movies = {
            new Movie("Avengers Ultimato", LocalDate.of(2019, Month.OCTOBER, 22), new BigDecimal(15)),
            new Movie("Thor", LocalDate.of(2017, Month.APRIL, 20), new BigDecimal(15)),
            new Movie("Spider Man", LocalDate.of(2020, Month.JANUARY, 18), new BigDecimal(15)),
            new Movie("Hulk", LocalDate.of(2015, Month.MAY, 12), new BigDecimal(13)),
            new Movie("Iron Man", LocalDate.of(2012, Month.JULY, 22), new BigDecimal(15))
    };

    public List<Movie> findAll(){
        return Arrays.asList(movies);
    }
}
