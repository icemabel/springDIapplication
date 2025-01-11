package com.hande.springDIapplication.services.operatingEnvironments;

import com.hande.springDIapplication.controllers.MyOperatingEnvironmentsController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

/*
 * 09/01/2025
 * handebarkan
 */
@ActiveProfiles({"Dev"})
@SpringBootTest
class DevelopmentTest {

    @Autowired
    MyOperatingEnvironmentsController controller;

    @Test
    void getEnvironment() {
        System.out.println(controller.getEnvironment());
    }


}