package com.bespoke.bakes.domain.request;

import java.util.Date;

public class CreateQuoteRequest {
    private Long userId;
    private Long bundleId;
    private String occasion;
    private String itemType;
    private String cakeFlavour;
    private String icingType;
    private String icingFlavour;
    private String icingColour;
    private String cakeSize;
    private Long noOfTiers;
    private String description;
    private Long quantity;
    private String genderIndicator;
    private Date dateTimeRequired;
    private Float locationLongitude;
    private Float locationLatitude;
    private String deliveryOption;
    private String budget;
    private Long locationId;
    private String nickname;
    private String additionalInfo;

    public CreateQuoteRequest() {
    }

    public CreateQuoteRequest(Long userId, Long bundleId, String occasion, String itemType, String cakeFlavour, String icingType, String icingFlavour, String icingColour, String cakeSize, Long noOfTiers, String description, Long quantity, String genderIndicator, Date dateTimeRequired, Float locationLongitude, Float locationLatitude, String deliveryOption, String budget, String additionalInfo, Long locationId, String nickname) {
        this.userId = userId;
        this.bundleId = bundleId;
        this.occasion = occasion;
        this.itemType = itemType;
        this.cakeFlavour = cakeFlavour;
        this.icingType = icingType;
        this.icingFlavour = icingFlavour;
        this.icingColour = icingColour;
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
        this.locationId = locationId;
        this.nickname = nickname;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getIcingColour() {
        return icingColour;
    }

    public void setIcingColour(String icingColour) {
        this.icingColour = icingColour;
    }

    public String getCakeSize() {
        return cakeSize;
    }

    public void setCakeSize(String cakeSize) {
        this.cakeSize = cakeSize;
    }

    public Long getNoOfTiers() {
        return noOfTiers;
    }

    public void setNoOfTiers(Long noOfTiers) {
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

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
