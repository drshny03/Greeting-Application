package com.capgeminitrainning.greetingApp.controller;

import com.capgeminitrainning.greetingApp.service.GreetingService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping
    public String getGreeting(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName)
    {
        return greetingService.getGreeting(firstName, lastName);
    }
}
