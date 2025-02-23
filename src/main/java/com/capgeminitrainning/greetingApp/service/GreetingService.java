package com.capgeminitrainning.greetingApp.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    public String getGreeting(String firstName, String lastName)
    {
        if (firstName != null && lastName != null)
        {
            return "Hello " + firstName + " " + lastName;
        } else if (firstName != null)
        {
            return "Hello " + firstName;
        } else if (lastName != null)
        {
            return "Hello " + lastName;
        } else
        {
            return "Hello World";
        }
    }
}
