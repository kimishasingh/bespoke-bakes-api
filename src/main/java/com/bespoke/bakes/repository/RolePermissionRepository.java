package com.bespoke.bakes.repository;

import com.bespoke.bakes.domain.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolePermissionRepository extends JpaRepository<RolePermission, Long> {
}
