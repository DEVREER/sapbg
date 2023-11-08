package com.sapbg.app.controller;

import com.sapbg.app.model.Company;
import com.sapbg.app.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/add")
    public ResponseEntity<Company> addCompany(@RequestBody Company company) {
        Company newCompany = companyService.addCompany(company);
        return ResponseEntity.ok(newCompany);
    }
}
