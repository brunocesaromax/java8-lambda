package com.aprendizado.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Aula04 {

    public static void filter(List<String> list, Predicate<String> predicate) {
        for (String s : list) {
            if (predicate.test(s))
                System.out.println(s);
        }
    }

    public static void main(String[] args) {
        List<String> states = Arrays.asList(
                "Goiás",
                "Paraná",
                "São Paulo",
                "Amazonas",
                "Santa Catarina"
        );

        System.out.println("Estados que iniciam com a letra S:");
        filter(states, (s) -> s.startsWith("S"));// Passando como parâmetro um bloco de código

        System.out.println("Estados que finalizam com a letra s:");
        filter(states, (s) -> s.endsWith("s"));

        System.out.println("Estados que contém mais de 10 caracteres:");
        filter(states, (s) -> s.length() > 10);
    }
}
