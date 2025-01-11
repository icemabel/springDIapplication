package com.hande.springDIapplication.controllers;

import com.hande.springDIapplication.services.GreetingService;
import org.springframework.stereotype.Controller;

/*
 * 09/01/2025
 * handebarkan
 */
@Controller
public class Myi18NControllerEN implements GreetingService {

    private final GreetingService greetingService;

    public Myi18NControllerEN(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
