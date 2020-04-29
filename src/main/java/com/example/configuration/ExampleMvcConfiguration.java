package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class ExampleMvcConfiguration extends DelegatingWebMvcConfiguration {

    @Configuration
    public class Inner implements WebMvcConfigurer {

        @Override
        public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
            System.out.println("Method2 called: " + ExampleMvcConfiguration.this.getMessageConverters());
        }
    }

    @Override
    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
        System.out.println("Method1 called: " /*+ ExampleMvcConfiguration.this.getMessageConverters()*/);
    }

    @Bean
    public Dummy dummy() {
        return new Dummy();
    }

    public static final class Dummy {

    }
}