package com.hande.springDIapplication.controllers;

import com.hande.springDIapplication.services.GreetingService;
import com.hande.springDIapplication.services.operatingEnvironments.OperatingEnvironments;
import org.springframework.stereotype.Controller;

/*
 * 09/01/2025
 * handebarkan
 */
@Controller
public class MyOperatingEnvironmentsController {

    private final OperatingEnvironments operatingEnvironments;

    public MyOperatingEnvironmentsController(OperatingEnvironments operatingEnvironments) {
        this.operatingEnvironments = operatingEnvironments;
    }

    public String getEnvironment() {
        return "You are in " + operatingEnvironments.showOperatingEnvironment() + "Environment";
    }
}
