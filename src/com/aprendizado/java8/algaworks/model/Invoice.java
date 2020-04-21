package com.aprendizado.java8.algaworks.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Invoice {
    private String clientEmail;
    private double value;
    private LocalDate dueDate;
    private boolean notificationSent;

    public Invoice(String clientEmail, double value, LocalDate dueDate) {
        this.clientEmail = clientEmail;
        this.value = value;
        this.dueDate = dueDate;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isNotificationSent() {
        return notificationSent;
    }

    public void setNotificationSent(boolean notificationSent) {
        this.notificationSent = notificationSent;
    }

    public String resume(){
        String dueDate = this.dueDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return String.format("Valor R$ %s, vencimento: %s", this.value, dueDate);
    }
}
