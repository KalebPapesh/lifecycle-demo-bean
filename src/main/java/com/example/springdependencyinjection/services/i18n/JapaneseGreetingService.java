package com.example.springdependencyinjection.services.i18n;

import com.example.springdependencyinjection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("JP")
@Service("i18NService")
public class JapaneseGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "こんにちは - JN";
    }
}
