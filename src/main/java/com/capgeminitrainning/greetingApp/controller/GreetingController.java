package com.capgeminitrainning.greetingApp.controller;


import com.capgeminitrainning.greetingApp.entity.GreetingEntity;
import com.capgeminitrainning.greetingApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
@Component
public class GreetingController {

    private GreetingService greetingService;

    //inject dependency
    @Autowired
    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    //http get method
    @GetMapping("/get")
    public String getGreeting(@RequestParam(required = false) String firstName,
                              @RequestParam(required = false) String lastName){
        return greetingService.greet(firstName, lastName);
    }
    //http put method
    @PutMapping("/put")
    public String putGreeting(@RequestParam(required = false) String firstName,
                              @RequestParam(required = false) String lastName){
        return greetingService.greet(firstName, lastName);
    }
    //http delete method
    @DeleteMapping("/delete")
    public String deleteGreeting(@RequestParam(required = false) String firstName,
                                 @RequestParam(required = false) String lastName){
        return greetingService.greet(firstName, lastName);
    }
    //http post method
    @PostMapping("/post")
    public GreetingEntity postGreeting(@RequestParam(required = false) String firstName,
                                       @RequestParam(required = false) String lastName,
                                       @RequestParam String id){
        return greetingService.saveGreeting(id, firstName, lastName);
    }
}