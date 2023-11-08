package com.sapbg.app.dto;

import java.math.BigDecimal;

public class InvoiceDto {
    private String invoiceNumber;
    private String customerName;
    private BigDecimal totalAmount;

    public InvoiceDto() {
        // Default constructor
    }

    public InvoiceDto(String invoiceNumber, String customerName, BigDecimal totalAmount) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    // Getters and setters for all fields

    @Override
    public String toString() {
        return "InvoiceDto{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
