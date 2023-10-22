package com.bespoke.bakes.controller;

import com.bespoke.bakes.domain.User;
import com.bespoke.bakes.domain.request.LoginRequest;
import com.bespoke.bakes.service.UserCredentialService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final UserCredentialService userCredentialService;

    public LoginController(UserCredentialService userCredentialService) {
        this.userCredentialService = userCredentialService;
    }

    @PostMapping
    public ResponseEntity<User> login(@RequestBody LoginRequest loginRequest) {
        User user = userCredentialService.loginUserBasedOnCredentials(loginRequest);
        if (user == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(user);
        }
    }
}
