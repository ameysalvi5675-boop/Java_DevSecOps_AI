package com.devsecops.payment_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/health")
    public String home() {
        return "payment-service running";
    }
}