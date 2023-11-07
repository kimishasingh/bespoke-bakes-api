package com.bespoke.bakes.repository;

import com.bespoke.bakes.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
