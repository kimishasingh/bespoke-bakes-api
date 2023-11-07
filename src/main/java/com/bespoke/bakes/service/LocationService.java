package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.Location;
import com.bespoke.bakes.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Location createLocation(Location location) {
        return locationRepository.save(location);
    }

    public Iterable<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    public Location findLocationById(Long id) {
        Optional<Location> location = locationRepository.findById(id);
        return location.orElse(null);
    }
}
