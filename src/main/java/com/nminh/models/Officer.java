package com.nminh.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="officers")
public class Officer implements Serializable {
    @Id @GeneratedValue
    @Column(name = "officer_id")
    private int id;
    @Column(name = "Id_card")
    private String idCard;
    @Column(name = "oficer_name")
    private String name;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "officer_date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @ManyToOne
    @JoinColumn(name="company_id")
    private Company company;

    public Officer() {
    }

    public Officer(String idCard, String name, String phone, Date date, Company company) {
        this.idCard = idCard;
        this.name = name;
        this.phone = phone;
        this.date = date;
        this.company = company;
    }
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Officer{" +
                "id=" + id +
                ", idCard='" + idCard + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
