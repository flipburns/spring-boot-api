package com.mycompany.boot.dto;

/**
 * This is our response class provided by our service. This will be wrapped with our generic response object which
 * gives us links and status and errors. By wrapping instead of extending, we avoid unnecessary inheritance.
 */
public class HelloServiceResponse {

    private String greeting;

    public HelloServiceResponse(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
