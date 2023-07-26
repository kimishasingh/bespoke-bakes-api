package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.Bundle;
import com.bespoke.bakes.repository.BundleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BundleService {

    private final BundleRepository bundleRepository;

    public BundleService(BundleRepository bundleRepository) {
        this.bundleRepository = bundleRepository;
    }

    public Bundle createBundle(Bundle bundle) {
        return bundleRepository.save(bundle);
    }

    public Iterable<Bundle> getAllBundles() {
        return bundleRepository.findAll();
    }

    public Bundle findBundleById(Long id) {
        Optional<Bundle> bundle = bundleRepository.findById(id);
        return bundle.orElse(null);
    }
}
