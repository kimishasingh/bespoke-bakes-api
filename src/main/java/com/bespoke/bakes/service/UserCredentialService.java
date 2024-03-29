package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.User;
import com.bespoke.bakes.domain.UserCredential;
import com.bespoke.bakes.domain.UserRole;
import com.bespoke.bakes.domain.request.LoginRequest;
import com.bespoke.bakes.repository.UserCredentialRepository;
import com.bespoke.bakes.repository.UserRepository;
import com.bespoke.bakes.repository.UserRoleRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserCredentialService {

    private final UserCredentialRepository userCredentialRepository;
    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;

    public UserCredentialService(UserCredentialRepository userCredentialRepository,
                                 UserRepository userRepository,
                                 UserRoleRepository userRoleRepository) {
        this.userCredentialRepository = userCredentialRepository;
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
    }

    public UserCredential createUserCredential(UserCredential userCredential) {
        return userCredentialRepository.save(userCredential);
    }

    public Iterable<UserCredential> getAllUserCredentials() {
        return userCredentialRepository.findAll();
    }

    public UserCredential findUserCredentialById(Long id) {
        Optional<UserCredential> userCredential = userCredentialRepository.findById(id);
        return userCredential.orElse(null);
    }

    public User loginUserBasedOnCredentials(LoginRequest loginRequest) {
        List<UserCredential> userCredentials = userCredentialRepository.findByUsernameAndPassword(loginRequest.getUsername(), loginRequest.getPassword());
        if (!CollectionUtils.isEmpty(userCredentials)) {
            Long userId = userCredentials.get(0).getUserId();
            List<UserRole> matchingRoles = userRoleRepository.findByUserIdAndRoleName(userId, loginRequest.getRoleName());
            if (!CollectionUtils.isEmpty(matchingRoles)) {
                return userRepository.findAllById(Collections.singletonList(userId)).get(0);
            }
        }
        return null;
    }
}
