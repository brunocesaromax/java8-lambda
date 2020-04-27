package com.aprendizado.java8.algaworks.ManagementInvoices;

import com.aprendizado.java8.algaworks.ManagementInvoices.dao.InvoiceDAO;
import com.aprendizado.java8.algaworks.ManagementInvoices.email.EmailSender;
import com.aprendizado.java8.algaworks.ManagementInvoices.model.Invoice;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();

        List<Invoice> overdueInvoices = new InvoiceDAO().findOverdueInvoices();

        //Antes do java 8
//        for (Invoice invoice: overdueInvoices){
//            emailSender.send(invoice.getClientEmail(), invoice.resume());
//        }

        //Depois do java 8
        //Apenas uma instrução no bloco da lambda nao é necessário o uso de {}
        //emailSender passou a ser final
        overdueInvoices.forEach(invoice -> {
            emailSender.send(invoice.getClientEmail(), invoice.resume());
            invoice.setNotificationSent(Boolean.TRUE);
        });
    }
}
