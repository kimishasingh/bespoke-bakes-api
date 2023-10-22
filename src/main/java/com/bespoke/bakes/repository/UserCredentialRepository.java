package com.bespoke.bakes.repository;

import com.bespoke.bakes.domain.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserCredentialRepository extends JpaRepository<UserCredential, Long> {

    @Query("SELECT uc FROM user_credential_tbl uc WHERE uc.username = ?1 and uc.password = ?2")
    List<UserCredential> findByUsernameAndPassword(String username, String password);
}
