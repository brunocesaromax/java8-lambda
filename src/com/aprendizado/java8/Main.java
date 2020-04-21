package com.aprendizado.java8;

public class Main {

    public static void main(String[] args) {
        /*Implementação da classe anonima Runnable,
         * usada quando não é necessário utilizar a referência de */
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Estudando a expressão lambda1.");
            }
        };

        Runnable r2;
        r2 =    () //Lista de argumentos (0 ou mais argumentos)
                -> //Seta -> indica que está trabalhando com uma expressão lambda
                System.out.println("Estudando a expressão lambda2."); //Corpo

        r1.run();
        r2.run();
    }
}
