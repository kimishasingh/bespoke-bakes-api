package com.bespoke.bakes.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "user_tbl")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column(name = "email_address")
    private String emailAddress;
    @Column(name = "is_active", insertable = false)
    private boolean isActive = true;

    public User() {
    }

    public User(String name, String surname, String mobileNumber, String emailAddress, boolean isActive) {
        this.name = name;
        this.surname = surname;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
