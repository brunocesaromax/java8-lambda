package com.aprendizado.java8;

import java.util.Arrays;
import java.util.List;

public class Aula03 {

    public static void main(String[] args) {
        //Antes do Java 8
        List<String> states = Arrays.asList(
                "Goiás",
                "Paraná",
                "São Paulo",
                "Amazonas",
                "Rio de Janeiro"
        );

        for (String s: states){
            System.out.println(s);
        }

        //Depois do Java 8
        //Usando method reference
        states.forEach(System.out::println);
    }
}
