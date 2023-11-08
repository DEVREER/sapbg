package com.sapbg.app.model;

import lombok.Getter;
import javax.persistence.*;
import java.util.Set;

@Getter
@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private double amount;

    // Constructors, getters, and setters

    // Constructors
    public Invoice() {
    }

    public Invoice(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Equals and hash code (based on your requirements)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Invoice invoice = (Invoice) o;

        return id != null ? id.equals(invoice.id) : invoice.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
