package com.hande.springDIapplication.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/*
 * 09/01/2025
 * handebarkan
 */
@Primary
@Service
public class GreetingServicePrimary implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello from primary bean";
    }
}
