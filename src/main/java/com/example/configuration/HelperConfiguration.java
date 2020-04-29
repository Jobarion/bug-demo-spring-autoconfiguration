package com.example.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class HelperConfiguration implements WebMvcConfigurer {

    @Autowired
    @Qualifier("dummy")
    private ExampleMvcConfiguration.Dummy dummy;
}
