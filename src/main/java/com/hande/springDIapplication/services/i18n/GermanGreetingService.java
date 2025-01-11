package com.hande.springDIapplication.services.i18n;

import com.hande.springDIapplication.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
 * 09/01/2025
 * handebarkan
 */
@Profile("DE")
@Service("i18NService")
public class GermanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Deutsch-Hallo!";
    }
}
