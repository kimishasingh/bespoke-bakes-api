package com.bespoke.bakes.repository;

import com.bespoke.bakes.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
