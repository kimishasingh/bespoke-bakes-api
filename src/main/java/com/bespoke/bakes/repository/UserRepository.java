package com.bespoke.bakes.repository;

import com.bespoke.bakes.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
