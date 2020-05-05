package com.aprendizado.java8.algaworks.Reduce_Collections_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.function.ToDoubleFunction;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class CalculateAVGGoals {
    public static void main(String[] args) {
        System.out.println("#### Média de gols ####");
        System.out.println();

        String name;
        List<Integer> goalsPerMatch;

        /*Try com scanner entrou no java 7*/
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Informe o nome do jogador: ");
            name = input.nextLine();

            String next;
            System.out.println("Você gostaria de adicionar gols a este jogador? (s/n): ");
            next = input.nextLine();

            int match = 1;
            goalsPerMatch = new ArrayList<>();
            while ("s".equalsIgnoreCase(next)) {
                System.out.printf("Quantos gols %s fez na partida %d: ", name, match);
                int goalsInMatch = Integer.parseInt(input.nextLine());
                goalsPerMatch.add(goalsInMatch);

                match++;

                System.out.println("Deseja continuar (s/n): ");
                next = input.nextLine();
            }
        }

        printAVGGoals(name, goalsPerMatch);
    }

    private static void printAVGGoals(String name, List<Integer> goalsPerMatch) {
        //Antes do java 8
        /*double totalGoals = 0;
        for (Integer goalsInMatch : goalsPerMatch) {
            totalGoals += goalsInMatch;
        }

        double avg = 0;
        if (!goalsPerMatch.isEmpty()) {
            avg = totalGoals / goalsPerMatch.size();
        }*/

        //No Java 8
        /*Stream<Integer> stream = goalsPerMatch.stream();
        //Chamar metodo double value para cada elemento do stream de Integer
        DoubleStream doubleStream = stream.mapToDouble(Integer::doubleValue);
        OptionalDouble optionalDouble = doubleStream.average();
        double avg = optionalDouble.orElse(0);*/

        double avg = goalsPerMatch.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

        System.out.printf("\nO %s fez uma média de %.2f gols por jogo", name, avg);
    }
}









