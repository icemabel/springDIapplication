package com.hande.springDIapplication.controllers;

import com.hande.springDIapplication.services.GreetingService;
import com.hande.springDIapplication.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/*
 * 09/01/2025
 * handebarkan
 */
@SpringBootTest
class MyControllerTest {

    @Autowired
    MyController controller;

    @Test
    void sayHallo() {
        System.out.println(controller.sayHallo());

    }
}