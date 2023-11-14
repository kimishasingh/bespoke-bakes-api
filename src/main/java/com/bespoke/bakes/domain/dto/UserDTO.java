package com.bespoke.bakes.domain.dto;

import com.bespoke.bakes.domain.BakerProfile;

public class UserDTO {

    private Long id;
    private String name;
    private String surname;
    private String mobileNumber;
    private String emailAddress;
    private boolean isActive = true;
    private BakerProfile bakerProfile;

    public UserDTO() {
    }

    public UserDTO(String name, String surname, String mobileNumber, String emailAddress, boolean isActive, BakerProfile bakerProfile) {
        this.name = name;
        this.surname = surname;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
        this.isActive = isActive;
        this.bakerProfile = bakerProfile;
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

    public BakerProfile getBakerProfile() {
        return bakerProfile;
    }

    public void setBakerProfile(BakerProfile bakerProfile) {
        this.bakerProfile = bakerProfile;
    }
}
