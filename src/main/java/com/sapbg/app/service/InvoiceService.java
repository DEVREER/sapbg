package com.sapbg.app.service;

import com.sapbg.app.model.Invoice;
import com.sapbg.app.repository.InvoiceRepository;
import com.sapbg.app.controller.InvoiceRequest; // Import your InvoiceRequest class
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    @Autowired
    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public Invoice generateInvoice(InvoiceRequest invoiceRequest) {
        // Implement the logic to generate an invoice using the provided request
        // You can create an Invoice object and populate it with the required data
        Invoice invoice = new Invoice();
        // Populate the invoice with data based on the InvoiceRequest
        invoice.setCustomerName(invoiceRequest.getCustomerName());
        invoice.setAmount(invoiceRequest.getAmount());
        // Add other fields as needed
        return invoice;
    }

    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    // Add more methods as needed
}
