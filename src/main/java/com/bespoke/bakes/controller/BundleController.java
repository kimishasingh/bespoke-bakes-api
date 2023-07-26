package com.bespoke.bakes.controller;

import com.bespoke.bakes.domain.Bundle;
import com.bespoke.bakes.service.BundleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bundle")
public class BundleController {

    private final BundleService bundleService;

    public BundleController(BundleService bundleService) {
        this.bundleService = bundleService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Bundle createBundle(@RequestBody Bundle bundle) {
        return bundleService.createBundle(bundle);
    }

    @GetMapping
    public Iterable<Bundle> getBundles() {
        return bundleService.getAllBundles();
    }

    @GetMapping("/{id}")
    public Bundle getBundleById(@PathVariable("id") Long id) {
        return bundleService.findBundleById(id);
    }
}
