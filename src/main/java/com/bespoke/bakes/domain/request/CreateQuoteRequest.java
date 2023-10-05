package com.bespoke.bakes.domain.request;

import com.bespoke.bakes.domain.enums.*;

import java.sql.Date;

public class CreateQuoteRequest {
    private Long userId;
    private Long bundleId;
    private Occasion occasion;
    private ItemType itemType;
    private CakeFlavour cakeFlavour;
    private IcingType icingType;
    private IcingFlavour icingFlavour;
    private CakeSize cakeSize;
    private Long noOfTiers;
    private String description;
    private Long quantity;
    private GenderIndicator genderIndicator;
    private Date dateTimeRequired;
    private Float locationLongitude;
    private Float locationLatitude;
    private DeliveryOption deliveryOption;
    private Budget budget;
    private String additionalInfo;

    public CreateQuoteRequest() {
    }

    public CreateQuoteRequest(Long userId, Long bundleId, Occasion occasion, ItemType itemType, CakeFlavour cakeFlavour, IcingType icingType, IcingFlavour icingFlavour, CakeSize cakeSize, Long noOfTiers, String description, Long quantity, GenderIndicator genderIndicator, Date dateTimeRequired, Float locationLongitude, Float locationLatitude, DeliveryOption deliveryOption, Budget budget, String additionalInfo) {
        this.userId = userId;
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

    public Occasion getOccasion() {
        return occasion;
    }

    public void setOccasion(Occasion occasion) {
        this.occasion = occasion;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public CakeFlavour getCakeFlavour() {
        return cakeFlavour;
    }

    public void setCakeFlavour(CakeFlavour cakeFlavour) {
        this.cakeFlavour = cakeFlavour;
    }

    public IcingType getIcingType() {
        return icingType;
    }

    public void setIcingType(IcingType icingType) {
        this.icingType = icingType;
    }

    public IcingFlavour getIcingFlavour() {
        return icingFlavour;
    }

    public void setIcingFlavour(IcingFlavour icingFlavour) {
        this.icingFlavour = icingFlavour;
    }

    public CakeSize getCakeSize() {
        return cakeSize;
    }

    public void setCakeSize(CakeSize cakeSize) {
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

    public GenderIndicator getGenderIndicator() {
        return genderIndicator;
    }

    public void setGenderIndicator(GenderIndicator genderIndicator) {
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

    public DeliveryOption getDeliveryOption() {
        return deliveryOption;
    }

    public void setDeliveryOption(DeliveryOption deliveryOption) {
        this.deliveryOption = deliveryOption;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
