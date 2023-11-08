package com.sapbg.app.repository;

import com.sapbg.app.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    // You can add custom query methods here if needed
}
