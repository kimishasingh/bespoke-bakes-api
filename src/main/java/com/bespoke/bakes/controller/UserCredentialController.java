package com.bespoke.bakes.controller;

import com.bespoke.bakes.domain.UserCredential;
import com.bespoke.bakes.service.UserCredentialService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-credential")
public class UserCredentialController {

    private final UserCredentialService userCredentialService;

    public UserCredentialController(UserCredentialService userCredentialService) {
        this.userCredentialService = userCredentialService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserCredential createUserCredential(@RequestBody UserCredential userCredential) {
        return userCredentialService.createUserCredential(userCredential);
    }

    @GetMapping
    public Iterable<UserCredential> getUserCredentials() {
        return userCredentialService.getAllUserCredentials();
    }
}
