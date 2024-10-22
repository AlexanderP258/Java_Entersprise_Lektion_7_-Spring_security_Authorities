package com.krillinator.Enterprise_Lektion_6_Spring_Security_Intro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public TestController(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/hash")
    public String testHash() {

        return passwordEncoder.encode("123");
    }
}
