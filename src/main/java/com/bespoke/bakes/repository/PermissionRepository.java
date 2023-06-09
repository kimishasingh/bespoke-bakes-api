package com.bespoke.bakes.repository;

import com.bespoke.bakes.domain.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
