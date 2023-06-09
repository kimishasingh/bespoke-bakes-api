package com.bespoke.bakes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

@Entity(name = "Quote_Request_Tbl")
public class QuoteRequest implements Serializable {

    @Id
    @GeneratedValue
    private Long Id;
    private Long BundleId;
    private String Occasion;
    private String ItemType;
    private String CakeFlavour;
    private String IcingType;
    private String IcingFlavour;
    private String CakeSize;
    private String NoOfTiers;
    private String Description;
    private Long Quantity;
    private String GenderIndicator;
    private Date DateTimeRequired;
    private Float LocationLongitude;
    private Float LocationLatitude;
    private String DeliveryOption;
    private String Budget;
    private String AdditionalInfo;
    private boolean IsActive;

    public QuoteRequest() {
    }

    public QuoteRequest(Long bundleId, String occasion, String itemType, String cakeFlavour, String icingType, String icingFlavour, String cakeSize, String noOfTiers, String description, Long quantity, String genderIndicator, Date dateTimeRequired, Float locationLongitude, Float locationLatitude, String deliveryOption, String budget, String additionalInfo, boolean isActive) {
        BundleId = bundleId;
        Occasion = occasion;
        ItemType = itemType;
        CakeFlavour = cakeFlavour;
        IcingType = icingType;
        IcingFlavour = icingFlavour;
        CakeSize = cakeSize;
        NoOfTiers = noOfTiers;
        Description = description;
        Quantity = quantity;
        GenderIndicator = genderIndicator;
        DateTimeRequired = dateTimeRequired;
        LocationLongitude = locationLongitude;
        LocationLatitude = locationLatitude;
        DeliveryOption = deliveryOption;
        Budget = budget;
        AdditionalInfo = additionalInfo;
        IsActive = isActive;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getBundleId() {
        return BundleId;
    }

    public void setBundleId(Long bundleId) {
        BundleId = bundleId;
    }

    public String getOccasion() {
        return Occasion;
    }

    public void setOccasion(String occasion) {
        Occasion = occasion;
    }

    public String getItemType() {
        return ItemType;
    }

    public void setItemType(String itemType) {
        ItemType = itemType;
    }

    public String getCakeFlavour() {
        return CakeFlavour;
    }

    public void setCakeFlavour(String cakeFlavour) {
        CakeFlavour = cakeFlavour;
    }

    public String getIcingType() {
        return IcingType;
    }

    public void setIcingType(String icingType) {
        IcingType = icingType;
    }

    public String getIcingFlavour() {
        return IcingFlavour;
    }

    public void setIcingFlavour(String icingFlavour) {
        IcingFlavour = icingFlavour;
    }

    public String getCakeSize() {
        return CakeSize;
    }

    public void setCakeSize(String cakeSize) {
        CakeSize = cakeSize;
    }

    public String getNoOfTiers() {
        return NoOfTiers;
    }

    public void setNoOfTiers(String noOfTiers) {
        NoOfTiers = noOfTiers;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Long getQuantity() {
        return Quantity;
    }

    public void setQuantity(Long quantity) {
        Quantity = quantity;
    }

    public String getGenderIndicator() {
        return GenderIndicator;
    }

    public void setGenderIndicator(String genderIndicator) {
        GenderIndicator = genderIndicator;
    }

    public Date getDateTimeRequired() {
        return DateTimeRequired;
    }

    public void setDateTimeRequired(Date dateTimeRequired) {
        DateTimeRequired = dateTimeRequired;
    }

    public Float getLocationLongitude() {
        return LocationLongitude;
    }

    public void setLocationLongitude(Float locationLongitude) {
        LocationLongitude = locationLongitude;
    }

    public Float getLocationLatitude() {
        return LocationLatitude;
    }

    public void setLocationLatitude(Float locationLatitude) {
        LocationLatitude = locationLatitude;
    }

    public String getDeliveryOption() {
        return DeliveryOption;
    }

    public void setDeliveryOption(String deliveryOption) {
        DeliveryOption = deliveryOption;
    }

    public String getBudget() {
        return Budget;
    }

    public void setBudget(String budget) {
        Budget = budget;
    }

    public String getAdditionalInfo() {
        return AdditionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        AdditionalInfo = additionalInfo;
    }

    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }
}
