package com.hande.springDIapplication.services.operatingEnvironments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
 * 09/01/2025
 * handebarkan
 */
@Profile("UAT")
@Service
public class UserAcceptanceTesting implements OperatingEnvironments{
    @Override
    public String showOperatingEnvironment() {
        return "User acceptance testing";
    }
}
