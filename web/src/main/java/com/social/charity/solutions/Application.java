package com.social.charity.solutions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(value = { "com.social.charity.solutions"})
public class Application {//extends SpringBootServletInitializer {

//    private static Class<Application> applicationClass = Application.class;
//
//    public static void main(String[] args) {
//        SpringApplication.run(applicationClass, args);
//    }
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        super.configure(application);
//        return application.sources(applicationClass);
//    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
