package com.aprendizado.java8;

public class Aula02 {

    interface Num {
        double getValue();
    }

    public static void main(String[] args) {
        Num n;
        n = () -> 333.11; // Implementação da interface por uma expressão lambda

        System.out.println(n.getValue());
    }
}
