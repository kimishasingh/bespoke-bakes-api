package com.bespoke.bakes.mapper;

import com.bespoke.bakes.domain.QuoteRequest;
import com.bespoke.bakes.domain.request.CreateQuoteRequest;
import org.springframework.stereotype.Component;

@Component
public class QuoteRequestMapper {

    public static QuoteRequest toQuoteRequest(CreateQuoteRequest createQuoteRequest) {
        QuoteRequest quoteRequest = new QuoteRequest();
        quoteRequest.setBundleId(createQuoteRequest.getBundleId());
        quoteRequest.setOccasion(createQuoteRequest.getOccasion().getDescription());
        quoteRequest.setItemType(createQuoteRequest.getItemType().getDescription());
        quoteRequest.setCakeFlavour(createQuoteRequest.getCakeFlavour().getDescription());
        quoteRequest.setIcingType(createQuoteRequest.getIcingType().getDescription());
        quoteRequest.setIcingFlavour(createQuoteRequest.getIcingFlavour().getDescription());
        quoteRequest.setCakeSize(createQuoteRequest.getCakeSize().getDescription());
        quoteRequest.setNoOfTiers(createQuoteRequest.getNoOfTiers());
        quoteRequest.setDescription(createQuoteRequest.getDescription());
        quoteRequest.setQuantity(createQuoteRequest.getQuantity());
        quoteRequest.setGenderIndicator(createQuoteRequest.getGenderIndicator() != null ? createQuoteRequest.getGenderIndicator().getDescription() : null);
        quoteRequest.setDateTimeRequired(createQuoteRequest.getDateTimeRequired());
        quoteRequest.setLocationLongitude(createQuoteRequest.getLocationLongitude());
        quoteRequest.setLocationLatitude(createQuoteRequest.getLocationLatitude());
        quoteRequest.setDeliveryOption(createQuoteRequest.getDeliveryOption().getDescription());
        quoteRequest.setBudget(createQuoteRequest.getBudget().getDescription());
        quoteRequest.setAdditionalInfo(createQuoteRequest.getAdditionalInfo());
        return quoteRequest;
    }
}
