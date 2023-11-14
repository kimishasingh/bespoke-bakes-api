package com.bespoke.bakes.mapper;

import com.bespoke.bakes.domain.Bundle;
import com.bespoke.bakes.domain.QuoteResponse;
import com.bespoke.bakes.domain.dto.QuoteResponseDTO;
import com.bespoke.bakes.domain.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class QuoteResponseMapper {

    public static QuoteResponseDTO toQuoteResponse(QuoteResponse quoteResponse,
                                                   Bundle bundle,
                                                   UserDTO baker) {
        QuoteResponseDTO quoteResponseDTO = new QuoteResponseDTO();
        quoteResponseDTO.setId(quoteResponse.getId());
        quoteResponseDTO.setBundle(bundle);
        quoteResponseDTO.setQuoteRequestId(quoteResponse.getQuoteRequestId());
        quoteResponseDTO.setBundleTotal(quoteResponse.getBundleTotal());
        quoteResponseDTO.setQuoteRequestTotal(quoteResponse.getQuoteRequestTotal());
        quoteResponseDTO.setDiscountAppliedPercentage(quoteResponse.getDiscountAppliedPercentage());
        quoteResponseDTO.setQuoteAccepted(quoteResponse.isQuoteAccepted());
        quoteResponseDTO.setActive(quoteResponse.isActive());
        quoteResponseDTO.setBaker(baker);
        return quoteResponseDTO;
    }
}
