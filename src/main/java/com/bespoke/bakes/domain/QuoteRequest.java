package com.bespoke.bakes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

@Entity(name = "quote_request_tbl")
public class QuoteRequest implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long bundleId;
    private String occasion;
    private String itemType;
    private String cakeFlavour;
    private String icingType;
    private String icingFlavour;
    private String cakeSize;
    private String noOfTiers;
    private String description;
    private Long quantity;
    private String genderIndicator;
    private Date dateTimeRequired;
    private Float locationLongitude;
    private Float locationLatitude;
    private String deliveryOption;
    private String budget;
    private String additionalInfo;
    private boolean isActive;

    public QuoteRequest() {
    }

    public QuoteRequest(Long id, Long bundleId, String occasion, String itemType, String cakeFlavour, String icingType, String icingFlavour, String cakeSize, String noOfTiers, String description, Long quantity, String genderIndicator, Date dateTimeRequired, Float locationLongitude, Float locationLatitude, String deliveryOption, String budget, String additionalInfo, boolean isActive) {
        this.id = id;
        this.bundleId = bundleId;
        this.occasion = occasion;
        this.itemType = itemType;
        this.cakeFlavour = cakeFlavour;
        this.icingType = icingType;
        this.icingFlavour = icingFlavour;
        this.cakeSize = cakeSize;
        this.noOfTiers = noOfTiers;
        this.description = description;
        this.quantity = quantity;
        this.genderIndicator = genderIndicator;
        this.dateTimeRequired = dateTimeRequired;
        this.locationLongitude = locationLongitude;
        this.locationLatitude = locationLatitude;
        this.deliveryOption = deliveryOption;
        this.budget = budget;
        this.additionalInfo = additionalInfo;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBundleId() {
        return bundleId;
    }

    public void setBundleId(Long bundleId) {
        this.bundleId = bundleId;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getCakeFlavour() {
        return cakeFlavour;
    }

    public void setCakeFlavour(String cakeFlavour) {
        this.cakeFlavour = cakeFlavour;
    }

    public String getIcingType() {
        return icingType;
    }

    public void setIcingType(String icingType) {
        this.icingType = icingType;
    }

    public String getIcingFlavour() {
        return icingFlavour;
    }

    public void setIcingFlavour(String icingFlavour) {
        this.icingFlavour = icingFlavour;
    }

    public String getCakeSize() {
        return cakeSize;
    }

    public void setCakeSize(String cakeSize) {
        this.cakeSize = cakeSize;
    }

    public String getNoOfTiers() {
        return noOfTiers;
    }

    public void setNoOfTiers(String noOfTiers) {
        this.noOfTiers = noOfTiers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getGenderIndicator() {
        return genderIndicator;
    }

    public void setGenderIndicator(String genderIndicator) {
        this.genderIndicator = genderIndicator;
    }

    public Date getDateTimeRequired() {
        return dateTimeRequired;
    }

    public void setDateTimeRequired(Date dateTimeRequired) {
        this.dateTimeRequired = dateTimeRequired;
    }

    public Float getLocationLongitude() {
        return locationLongitude;
    }

    public void setLocationLongitude(Float locationLongitude) {
        this.locationLongitude = locationLongitude;
    }

    public Float getLocationLatitude() {
        return locationLatitude;
    }

    public void setLocationLatitude(Float locationLatitude) {
        this.locationLatitude = locationLatitude;
    }

    public String getDeliveryOption() {
        return deliveryOption;
    }

    public void setDeliveryOption(String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
