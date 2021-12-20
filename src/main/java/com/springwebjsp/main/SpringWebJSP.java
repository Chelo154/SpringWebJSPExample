package com.springwebjsp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.springwebjsp.controller"})
public class SpringWebJSP {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebJSP.class);
    }
}
