package com.aprendizado.java8.algaworks.JSR310_Date_Time_API.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.DoubleStream;

public class Location {
    private List<Movie> movies;
    private Customer customer;
    private LocalDateTime rentalDate;
    private Devolution devolution;

    public Location(List<Movie> movies, Customer customer) {
        this.movies = movies;
        this.customer = customer;
        this.rentalDate = LocalDateTime.now(); //Data de hoje
        this.generateDevolution();
    }

    private void generateDevolution() {
        /*Data esperada é o dia de hoje mais um dia para cada filme locado*/
        this.devolution = new Devolution(LocalDateTime.of(calculateExpectedDate(), LocalTime.of(19, 0)));
    }

    private LocalDate calculateExpectedDate() {
        return this.rentalDate.plusDays(movies.size()).toLocalDate();
    }

    public void printReceipt() {
        System.out.printf("Obrigado %s.\n", this.customer.getName());
        System.out.println("Filme(s):");

        this.movies.forEach(movie -> System.out.println("- "+movie.getName()));
        BigDecimal totalLocationValue = this.movies.stream()
                .map(Movie::getValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.printf("Valor total R$%s\n", totalLocationValue);
        System.out.printf("Data devolução: %s\n",
                this.devolution.getExpectedDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
    }
}
