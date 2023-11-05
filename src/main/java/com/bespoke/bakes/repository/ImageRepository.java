package com.bespoke.bakes.repository;

import com.bespoke.bakes.domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {

    @Query("SELECT i FROM image_tbl i WHERE i.imageType = ?1 and i.matchingId = ?2")
    List<Image> findByImageTypeAndMatchingId(String imageType, Long matchingId);
}
