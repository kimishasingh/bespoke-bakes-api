package com.bespoke.bakes.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "baker_profile_tbl")
public class BakerProfile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "business_name")
    private String businessName;
    @Column(name = "business_location_suburb")
    private String businessLocationSuburb;
    @Column(name = "business_location_city")
    private String businessLocationCity;
    @Column(name = "business_instagram")
    private String businessInstagram;
    @Column(name = "business_facebook")
    private String businessFacebook;

    public BakerProfile() {
    }

    public BakerProfile(Long id, Long userId, String businessName, String businessLocationSuburb, String businessLocationCity, String businessInstagram, String businessFacebook) {
        this.id = id;
        this.userId = userId;
        this.businessName = businessName;
        this.businessLocationSuburb = businessLocationSuburb;
        this.businessLocationCity = businessLocationCity;
        this.businessInstagram = businessInstagram;
        this.businessFacebook = businessFacebook;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessLocationSuburb() {
        return businessLocationSuburb;
    }

    public void setBusinessLocationSuburb(String businessLocationSuburb) {
        this.businessLocationSuburb = businessLocationSuburb;
    }

    public String getBusinessLocationCity() {
        return businessLocationCity;
    }

    public void setBusinessLocationCity(String businessLocationCity) {
        this.businessLocationCity = businessLocationCity;
    }

    public String getBusinessInstagram() {
        return businessInstagram;
    }

    public void setBusinessInstagram(String businessInstagram) {
        this.businessInstagram = businessInstagram;
    }

    public String getBusinessFacebook() {
        return businessFacebook;
    }

    public void setBusinessFacebook(String businessFacebook) {
        this.businessFacebook = businessFacebook;
    }
}
