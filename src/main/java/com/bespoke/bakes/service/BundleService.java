package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.Bundle;
import com.bespoke.bakes.repository.BundleRepository;
import org.springframework.stereotype.Service;

@Service
public class BundleService {

    private BundleRepository bundleRepository;

    public BundleService(BundleRepository bundleRepository) {
        this.bundleRepository = bundleRepository;
    }

    public Bundle createBundle(Bundle bundle) {
        return bundleRepository.save(bundle);
    }

    public Iterable<Bundle> getAllBundles() {
        return bundleRepository.findAll();
    }
}
