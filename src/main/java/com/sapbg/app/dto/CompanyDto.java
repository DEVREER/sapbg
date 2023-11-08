package com.sapbg.app.dto;

public class CompanyDto {
    private Long companyId; // If you want to include an ID for the company
    private String companyName;
    private String address;
    private String contactEmail;
    private String contactPhone;

    public CompanyDto() {
        // Default constructor
    }

    public CompanyDto(String companyName, String address, String contactEmail, String contactPhone) {
        this.companyName = companyName;
        this.address = address;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
    }

    // Getters and setters for all fields

    @Override
    public String toString() {
        return "CompanyDTO{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                '}';
    }
}
