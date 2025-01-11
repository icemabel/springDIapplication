package com.hande.springDIapplication.services;

import org.springframework.stereotype.Service;

/*
 * 09/01/2025
 * handebarkan
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello eveyone from base service";
    }
}
