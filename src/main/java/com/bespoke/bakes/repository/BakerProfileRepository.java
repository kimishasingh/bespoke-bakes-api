package com.bespoke.bakes.repository;

import com.bespoke.bakes.domain.BakerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BakerProfileRepository extends JpaRepository<BakerProfile, Long> {

    @Query("SELECT bp FROM baker_profile_tbl bp WHERE bp.userId = ?1")
    List<BakerProfile> findByUserId(Long userId);
}
