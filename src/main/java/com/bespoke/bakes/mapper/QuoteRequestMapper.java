package com.bespoke.bakes.mapper;

import com.bespoke.bakes.domain.QuoteRequest;
import com.bespoke.bakes.domain.User;
import com.bespoke.bakes.domain.dto.QuoteRequestDTO;
import com.bespoke.bakes.domain.dto.QuoteResponseDTO;
import com.bespoke.bakes.domain.request.CreateQuoteRequest;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.List;

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
        quoteRequest.setLocationId(createQuoteRequest.getLocationId());
        quoteRequest.setNickname(createQuoteRequest.getNickname());
        return quoteRequest;
    }

    public static QuoteRequestDTO toQuoteRequestDTO(QuoteRequest quoteRequest, User user, List<QuoteResponseDTO> responses) {
        QuoteRequestDTO quoteRequestDTO = new QuoteRequestDTO();
        quoteRequestDTO.setId(quoteRequest.getId());
        quoteRequestDTO.setBundleId(quoteRequest.getBundleId());
        quoteRequestDTO.setOccasion(quoteRequest.getOccasion());
        quoteRequestDTO.setItemType(quoteRequest.getItemType());
        quoteRequestDTO.setCakeFlavour(quoteRequest.getCakeFlavour());
        quoteRequestDTO.setIcingType(quoteRequest.getIcingType());
        quoteRequestDTO.setIcingFlavour(quoteRequest.getIcingFlavour());
        quoteRequestDTO.setIcingColour(quoteRequest.getIcingColour());
        quoteRequestDTO.setCakeSize(quoteRequest.getCakeSize());
        quoteRequestDTO.setNoOfTiers(quoteRequest.getNoOfTiers());
        quoteRequestDTO.setDescription(quoteRequest.getDescription());
        quoteRequestDTO.setQuantity(quoteRequest.getQuantity());
        quoteRequestDTO.setGenderIndicator(quoteRequest.getGenderIndicator());
        quoteRequestDTO.setDateTimeRequired(new Timestamp(quoteRequest.getDateTimeRequired().getTime()));
        quoteRequestDTO.setLocationLongitude(quoteRequest.getLocationLongitude());
        quoteRequestDTO.setLocationLatitude(quoteRequest.getLocationLatitude());
        quoteRequestDTO.setDeliveryOption(quoteRequest.getDeliveryOption());
        quoteRequestDTO.setBudget(quoteRequest.getBudget());
        quoteRequestDTO.setAdditionalInfo(quoteRequest.getAdditionalInfo());
        quoteRequestDTO.setLocationId(quoteRequest.getLocationId());
        quoteRequestDTO.setNickname(quoteRequest.getNickname());
        quoteRequestDTO.setQuoteResponses(responses);
        quoteRequestDTO.setBuyer(user);
        return quoteRequestDTO;
    }
}
