package com.viitim.grs;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class GrsApplication extends SpringBootServletInitializer {
 
    public static void main(String[] args) {
        SpringApplication.run(applicationClass, args);
    }
 
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
 
    private static Class<GrsApplication> applicationClass = GrsApplication.class;
}

@RestController
class HelloController {
 
    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {
 
        return "Hi " + name + " !";
 
    }
}