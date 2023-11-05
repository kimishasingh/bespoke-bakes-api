package com.bespoke.bakes.mapper;

import com.bespoke.bakes.domain.QuoteRequest;
import com.bespoke.bakes.domain.request.CreateQuoteRequest;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class QuoteRequestMapper {

    public static QuoteRequest toQuoteRequest(CreateQuoteRequest createQuoteRequest) {
        QuoteRequest quoteRequest = new QuoteRequest();
        quoteRequest.setBundleId(createQuoteRequest.getBundleId());
        quoteRequest.setOccasion(createQuoteRequest.getOccasion());
        quoteRequest.setItemType(createQuoteRequest.getItemType());
        quoteRequest.setCakeFlavour(createQuoteRequest.getCakeFlavour());
        quoteRequest.setIcingType(createQuoteRequest.getIcingType());
        quoteRequest.setIcingFlavour(createQuoteRequest.getIcingFlavour());
        quoteRequest.setIcingColour(createQuoteRequest.getIcingColour());
        quoteRequest.setCakeSize(createQuoteRequest.getCakeSize());
        quoteRequest.setNoOfTiers(createQuoteRequest.getNoOfTiers());
        quoteRequest.setDescription(createQuoteRequest.getDescription());
        quoteRequest.setQuantity(createQuoteRequest.getQuantity());
        quoteRequest.setGenderIndicator(createQuoteRequest.getGenderIndicator() != null ? createQuoteRequest.getGenderIndicator() : null);
        quoteRequest.setDateTimeRequired(new Timestamp(createQuoteRequest.getDateTimeRequired().getTime()));
        quoteRequest.setLocationLongitude(createQuoteRequest.getLocationLongitude());
        quoteRequest.setLocationLatitude(createQuoteRequest.getLocationLatitude());
        quoteRequest.setDeliveryOption(createQuoteRequest.getDeliveryOption());
        quoteRequest.setBudget(createQuoteRequest.getBudget());
        quoteRequest.setAdditionalInfo(createQuoteRequest.getAdditionalInfo());
        return quoteRequest;
    }
}
