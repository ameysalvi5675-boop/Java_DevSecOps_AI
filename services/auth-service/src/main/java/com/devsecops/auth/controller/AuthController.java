package com.devsecops.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/")
    public String home() {
        return "Auth Service Running";
    }

    @GetMapping("/health")
    public String health() {
        return "AUTH SERVICE HEALTHY";
    }
}