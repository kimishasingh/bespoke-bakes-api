package com.bespoke.bakes.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "Bundle_Tbl")
public class Bundle implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;
    @Column(name = "UserId")
    private Long userId;
    @Column(name = "IsActive")
    private boolean isActive;

    public Bundle() {
    }

    public Bundle(Long userId, boolean isActive) {
        this.userId = userId;
        this.isActive = isActive;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
