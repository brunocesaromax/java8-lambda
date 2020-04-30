package com.aprendizado.java8.algaworks.JSR310_Date_Time_API.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Devolution {
    private LocalDateTime expectedDate;
    private LocalDateTime realDate;
    private BigDecimal value;

    public Devolution(LocalDateTime expectedDate) {
        this.expectedDate = expectedDate;
    }

    public LocalDateTime getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(LocalDateTime expectedDate) {
        this.expectedDate = expectedDate;
    }

    public LocalDateTime getRealDate() {
        return realDate;
    }

    public void setRealDate(LocalDateTime realDate) {
        this.realDate = realDate;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
