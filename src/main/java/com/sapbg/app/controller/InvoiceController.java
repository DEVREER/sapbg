package com.sapbg.app.controller;
import com.sapbg.app.service.InvoiceService;

import com.sapbg.app.model.Invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @PostMapping("/generate")
    public ResponseEntity<Object> generateInvoice(@RequestBody InvoiceRequest invoiceRequest) {

        Invoice invoice = invoiceService.generateInvoice(invoiceRequest);
        return ResponseEntity.ok(invoice);
    }
}
