package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.*;
import com.bespoke.bakes.domain.dto.QuoteRequestDTO;
import com.bespoke.bakes.domain.dto.QuoteResponseDTO;
import com.bespoke.bakes.domain.dto.UserDTO;
import com.bespoke.bakes.domain.request.AcceptedQuoteRequest;
import com.bespoke.bakes.domain.request.CreateQuoteRequest;
import com.bespoke.bakes.mapper.QuoteRequestMapper;
import com.bespoke.bakes.mapper.QuoteResponseMapper;
import com.bespoke.bakes.mapper.UserMapper;
import com.bespoke.bakes.repository.BakerProfileRepository;
import com.bespoke.bakes.repository.QuoteRequestRepository;
import com.bespoke.bakes.repository.QuoteResponseRepository;
import com.bespoke.bakes.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuoteRequestService {

    private final QuoteRequestRepository quoteRequestRepository;
    private final QuoteResponseRepository quoteResponseRepository;
    private final BakerProfileRepository bakerProfileRepository;
    private final UserRepository userRepository;
    private final BundleService bundleService;

    public QuoteRequestService(QuoteRequestRepository quoteRequestRepository,
                               QuoteResponseRepository quoteResponseRepository,
                               BakerProfileRepository bakerProfileRepository,
                               UserRepository userRepository,
                               BundleService bundleService) {
        this.quoteRequestRepository = quoteRequestRepository;
        this.quoteResponseRepository = quoteResponseRepository;
        this.bakerProfileRepository = bakerProfileRepository;
        this.userRepository = userRepository;
        this.bundleService = bundleService;
    }

    public QuoteRequest createQuoteRequest(CreateQuoteRequest createQuoteRequest) {
        Bundle bundle = bundleService.createBundle(new Bundle(createQuoteRequest.getUserId()));
        createQuoteRequest.setBundleId(bundle.getId());

        QuoteRequest quoteRequest = QuoteRequestMapper.toQuoteRequest(createQuoteRequest);
        return quoteRequestRepository.save(quoteRequest);
    }

    public Iterable<QuoteRequest> getAllQuoteRequests() {
        return quoteRequestRepository.findAll();
    }

    public QuoteRequest findQuoteRequestById(Long id) {
        Optional<QuoteRequest> quoteRequest = quoteRequestRepository.findById(id);
        return quoteRequest.orElse(null);
    }

    public List<AcceptedQuoteRequest> findAcceptedQuoteRequestsByUserId(Long userId) {
        List<AcceptedQuoteRequest> acceptedQuoteRequests = new ArrayList<>();

        List<QuoteRequest> allQuoteRequests = quoteRequestRepository.findByUserId(userId);
        allQuoteRequests.forEach(quoteRequest -> {
            Optional<QuoteResponse> acceptedQuoteResponse = quoteResponseRepository.findAcceptedQuoteResponse(quoteRequest.getId());
            if (acceptedQuoteResponse.isPresent()) {
                AcceptedQuoteRequest acceptedQuoteRequest = new AcceptedQuoteRequest(quoteRequest, acceptedQuoteResponse.get());
                acceptedQuoteRequests.add(acceptedQuoteRequest);
            }
        });
        return acceptedQuoteRequests;
    }

    public List<QuoteRequestDTO> findAllQuoteRequestsByUserId(Long userId) {
        List<QuoteRequestDTO> allQuoteRequestsDTO = new ArrayList<>();

        List<QuoteRequest> allQuoteRequests = quoteRequestRepository.findByUserId(userId);
        Optional<User> buyerUser = userRepository.findById(userId);
        allQuoteRequests.forEach(quoteRequest -> {
            Bundle bundle = bundleService.findBundleById(quoteRequest.getBundleId());
            List<QuoteResponse> quoteResponses = quoteResponseRepository.findByQuoteRequestId(quoteRequest.getId());
            List<QuoteResponseDTO> quoteResponseDTOs = quoteResponses
                    .stream()
                    .map(quoteResponse -> {
                        Optional<User> bakerUser = userRepository.findById(quoteResponse.getUserId());
                        if (bakerUser.isPresent()) {
                            List<BakerProfile> bakerProfiles = bakerProfileRepository.findByUserId(bakerUser.get().getId());
                            if (!CollectionUtils.isEmpty(bakerProfiles)) {
                                UserDTO bakerUserDTO = UserMapper.toUserDTO(bakerUser.get(), bakerProfiles.get(0));
                                return QuoteResponseMapper.toQuoteResponse(quoteResponse, bundle, bakerUserDTO);
                            }
                        }
                        return null;
                    })
                    .toList();
            allQuoteRequestsDTO.add(QuoteRequestMapper.toQuoteRequestDTO(quoteRequest, buyerUser.orElse(null), quoteResponseDTOs));
        });
        return allQuoteRequestsDTO;
    }
}
