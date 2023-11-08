package com.sapbg.app.repository;

import com.sapbg.app.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    // You can add custom query methods here if needed
}
