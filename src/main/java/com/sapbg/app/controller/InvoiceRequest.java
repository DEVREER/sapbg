package com.sapbg.app.controller;

import lombok.Getter;

@Getter
public class InvoiceRequest {
    private String customerName;
    private double amount;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Add other getters and setters as needed
}
