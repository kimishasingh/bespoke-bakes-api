package com.bespoke.bakes.service;

import com.bespoke.bakes.domain.UserCredential;
import com.bespoke.bakes.repository.UserCredentialRepository;
import org.springframework.stereotype.Service;

@Service
public class UserCredentialService {

    private UserCredentialRepository userCredentialRepository;

    public UserCredentialService(UserCredentialRepository userCredentialRepository) {
        this.userCredentialRepository = userCredentialRepository;
    }

    public UserCredential createUserCredential(UserCredential userCredential) {
        return userCredentialRepository.save(userCredential);
    }

    public Iterable<UserCredential> getAllUserCredentials() {
        return userCredentialRepository.findAll();
    }
}
