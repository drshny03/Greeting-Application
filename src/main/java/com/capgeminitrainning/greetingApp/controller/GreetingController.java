package com.capgeminitrainning.greetingApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public Greeting getGreeting() {
        return new Greeting("Hello, GET request received!");
    }

    @PostMapping
    public Greeting postGreeting() {
        return new Greeting("Hello, POST request received!");
    }

    @PutMapping
    public Greeting putGreeting() {
        return new Greeting("Hello, PUT request received!");
    }

    @DeleteMapping
    public Greeting deleteGreeting() {
        return new Greeting("Hello, DELETE request received!");
    }

    static class Greeting {
        private String message;

        public Greeting(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
