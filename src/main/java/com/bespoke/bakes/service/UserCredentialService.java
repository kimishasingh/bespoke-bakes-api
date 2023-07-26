package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.UserCredential;
import com.bespoke.bakes.repository.UserCredentialRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserCredentialService {

    private final UserCredentialRepository userCredentialRepository;

    public UserCredentialService(UserCredentialRepository userCredentialRepository) {
        this.userCredentialRepository = userCredentialRepository;
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
}
