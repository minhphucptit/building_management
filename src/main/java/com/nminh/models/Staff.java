package com.nminh.models;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="staffs")
public class Staff implements Serializable {
    @Id @GeneratedValue
    private int id;
    @Column(name="staff_name")
    private String name;
    @Column(name="Address")
    private String address;
    @Column(name="Phone")
    private String phone;
    @Column(name="staff_date")
    private String date;
    @Column(name="staff_level")
    private int level;
    @ManyToOne
    @JoinColumn(name="service_id")
    private Service service;

    public Staff() {
    }

    public Staff(String name, String address, String phone, String date, int level, Service service) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.date = date;
        this.level = level;
        this.service = service;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public Service getService() {
        return this.service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", date='" + date + '\'' +
                ", level=" + level +
                ", serviceId=" + service +
                '}';
    }
}
