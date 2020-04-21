package com.aprendizado.java8;

public class Aula02 {

    interface Num {
        double getValue();
    }

    interface NumericValue {
        boolean test(int n);
    }

    public static void main(String[] args) {

        //Expressão lambda utilizada como uma constante
        Num n;
        n = () -> 333.11; // Implementação da interface por uma expressão lambda
        System.out.println(n.getValue());

        //Utilização da classe math com a estrutura lambda
        Num n2 = () -> Math.random() * 100;
        System.out.println(n2.getValue());

        NumericValue isPar = (int number) -> (number % 2) == 0;
        System.out.println(isPar.test(89));
        System.out.println(isPar.test(90));
    }
}
