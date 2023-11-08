package com.sapbg.app.service;

import com.sapbg.app.model.Company;
import com.sapbg.app.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company addCompany(Company company) {
        // Implement the logic to add a company here
        // You can save the company to the database or perform any other required actions
        return companyRepository.save(company);
    }

    // Add more methods as needed
}
