package com.aprendizado.java8.algaworks.Management_Invoices.dao;

import com.aprendizado.java8.algaworks.Management_Invoices.model.Invoice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class InvoiceDAO {

    public List<Invoice> findOverdueInvoices() {
        //Poderia buscar nesse momento no BD
        Invoice invoice1 = new Invoice("bruno@gmail.com", 500.25, LocalDate.now().minusDays(3));
        Invoice invoice2 = new Invoice("dani@gmail.com", 355.44, LocalDate.now().minusDays(2));
        Invoice invoice3 = new Invoice("rai@gmail.com", 895.66, LocalDate.now().minusDays(6));

        return Arrays.asList(invoice1, invoice2, invoice3);
    }

}
