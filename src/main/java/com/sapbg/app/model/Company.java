package com.sapbg.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;
    private String companyNameBG;
    private int EIK;
    private String country;
    private String placeOfResidence;
    private String address;
    private String MOL;
    private String email;
    private String companyNameEN;
    private int ddsNumber;
    private String countryEN;
    private String addressEN;
    private String molEN;
    private String telephoneNumber;

    // Constructors
    public Company() {
    }

    public Company(String companyNameBG, int EIK, String country, String placeOfResidence, String address, String MOL,
                   String email, String companyNameEN, int ddsNumber, String countryEN, String addressEN, String molEN,
                   String telephoneNumber) {
        this.companyNameBG = companyNameBG;
        this.EIK = EIK;
        this.country = country;
        this.placeOfResidence = placeOfResidence;
        this.address = address;
        this.MOL = MOL;
        this.email = email;
        this.companyNameEN = companyNameEN;
        this.ddsNumber = ddsNumber;
        this.countryEN = countryEN;
        this.addressEN = addressEN;
        this.molEN = molEN;
        this.telephoneNumber = telephoneNumber;
    }

    // Getters and setters
    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyNameBG() {
        return companyNameBG;
    }

    public void setCompanyNameBG(String companyNameBG) {
        this.companyNameBG = companyNameBG;
    }

    public int getEIK() {
        return EIK;
    }

    public void setEIK(int EIK) {
        this.EIK = EIK;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMOL() {
        return MOL;
    }

    public void setMOL(String MOL) {
        this.MOL = MOL;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyNameEN() {
        return companyNameEN;
    }

    public void setCompanyNameEN(String companyNameEN) {
        this.companyNameEN = companyNameEN;
    }

    public int getDdsNumber() {
        return ddsNumber;
    }

    public void setDdsNumber(int ddsNumber) {
        this.ddsNumber = ddsNumber;
    }

    public String getCountryEN() {
        return countryEN;
    }

    public void setCountryEN(String countryEN) {
        this.countryEN = countryEN;
    }

    public String getAddressEN() {
        return addressEN;
    }

    public void setAddressEN(String addressEN) {
        this.addressEN = addressEN;
    }

    public String getMolEN() {
        return molEN;
    }

    public void setMolEN(String molEN) {
        this.molEN = molEN;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    // Equals and hash code (based on your requirements)
    // Other methods (based on your requirements)
}
