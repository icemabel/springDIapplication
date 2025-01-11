package com.hande.springDIapplication.controllers;

import com.hande.springDIapplication.services.GreetingService;
import org.springframework.stereotype.Controller;

/*
 * 08/01/2025
 * handebarkan
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHallo() {
        //System.out.println("I'm in the controller");
        return greetingService.sayGreeting();
    }
}
