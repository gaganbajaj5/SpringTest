package com.sap;

import com.sap.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
//@ComponentScan(basePackages = "com.sap")
public class App 
{
    public static void main( String[] args )
    {

        SpringApplication.run(App.class);
    }
}
