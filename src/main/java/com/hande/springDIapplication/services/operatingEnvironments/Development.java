package com.hande.springDIapplication.services.operatingEnvironments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
 * 09/01/2025
 * handebarkan
 */
@Profile({"Dev", "default"})
@Service
public class Development implements OperatingEnvironments{
    @Override
    public String showOperatingEnvironment() {
        return "Development";
    }
}
