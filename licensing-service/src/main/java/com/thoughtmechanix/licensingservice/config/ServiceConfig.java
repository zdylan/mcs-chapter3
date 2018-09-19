package com.thoughtmechanix.licensingservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {

    @Value("${exmaple.property}")
    private String exampleProperty;

    public String getExampleProperty() {
        return exampleProperty;
    }
}
