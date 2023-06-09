package com.bespoke.bakes.repository;

import com.bespoke.bakes.domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
