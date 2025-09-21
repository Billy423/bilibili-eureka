package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

/**
 * Bilibili Eureka Service Registry
 * 
 * This is the central service discovery component of the Bilibili microservices architecture.
 * It enables automatic service registration, discovery, and health monitoring for all microservices.
 * 
 */
@SpringBootApplication
@EnableEurekaServer  // Enables Eureka server functionality
public class App {

    /**
     * Main application entry point
     * Starts the Eureka server on port 15006
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args){
        ApplicationContext app = SpringApplication.run(App.class, args);
    }

}