package com.aprendizado.java8.algaworks.ManagementInvoices.email;

public class EmailSender {

    public void send(String to, String text) {
        //Nesse passo poderia utilizar alguma biblioteca para enviar o email
        System.out.printf("Enviando email para: %s. O texto: %s\n", to, text);
    }
}
