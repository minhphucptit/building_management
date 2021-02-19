package com.nminh.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="companies")
public class Company implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="company_id")
    private int id;
    @Column(name="company_name")
    private String name;
    @Column(name="Address")
    private String address;
    @Column(name="Phone")
    private String phone;
    @Column(name="tax_code")
    private String tax_code;
    @Column(name="Capital")
    private Float capital;
    @Column(name="Specialized")
    private String special;
    @Column(name="Acreage")
    private Float acreage;
    @OneToMany
    @JoinColumn(name="officer_id")
    private List<Officer> officerSet;
    private double cost;
    public Company() {
    }

    public Company(String name, String address, String phone, String tax_code, Float capital, String special, Float acreage) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.tax_code = tax_code;
        this.capital = capital;
        this.special = special;
        this.acreage = acreage;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<Officer> getOfficerSet() {
        return officerSet;
    }

    public void setOfficerSet(List<Officer> officerSet) {
        this.officerSet = officerSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTax_code() {
        return tax_code;
    }

    public void setTax_code(String tax_code) {
        this.tax_code = tax_code;
    }

    public Float getCapital() {
        return capital;
    }

    public void setCapital(Float capital) {
        this.capital = capital;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public Float getAcreage() {
        return acreage;
    }

    public void setAcreage(Float acreage) {
        this.acreage = acreage;
    }

}
