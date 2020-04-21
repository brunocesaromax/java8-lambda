package com.aprendizado.java8;

public class Aula02 {

    interface Num {
        double getValue();
    }

    interface NumericValue {
        boolean test(int n);
    }

    interface NumericValue2 {
        boolean test(int n1, int n2);
    }

    public static void main(String[] args) {

        //Expressão lambda utilizada como uma constante
        Num n;
        n = () -> 333.11; // Implementação da interface por uma expressão lambda
        System.out.println(n.getValue());

        //Utilização da classe math com a estrutura lambda
        Num n2 = () -> Math.random() * 100;
        System.out.println(n2.getValue());

        NumericValue isPar = number -> (number % 2) == 0;
        System.out.println(isPar.test(89));
        System.out.println(isPar.test(90));

        NumericValue2 isDiv = (x, y) -> (x % y) == 0; //Compilador infere o tipo da variável
        System.out.println(isDiv.test(10,2));
        System.out.println(isDiv.test(10,3));

        NumericValue2 isBiggerThen1000 = (x, y) -> {
            return x + y > 1000;
        };
        System.out.println(isBiggerThen1000.test(500,501));

    }
}
