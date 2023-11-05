package com.bespoke.bakes.repository;

import com.bespoke.bakes.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    @Query("SELECT ur FROM user_role_tbl ur " +
            "LEFT JOIN role_tbl r on r.id = ur.roleId " +
            "WHERE ur.userId = ?1 and r.name = ?2")
    List<UserRole> findByUserIdAndRoleName(Long userId, String roleName);
}
