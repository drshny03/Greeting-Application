package com.capgeminitrainning.greetingApp.service;


import com.capgeminitrainning.greetingApp.entity.GreetingEntity;
import com.capgeminitrainning.greetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class GreetingService {
    private GreetingRepository greetingRepository;
    //construction
    @Autowired
    public GreetingService(GreetingRepository greetingRepository){
        //dependency injection
        this.greetingRepository = greetingRepository;
    }
    //service for greeting
    public String greet(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello, " + firstName + " " + lastName;
        } else if (firstName != null) {
            return "Hello, " + firstName;
        } else if (lastName != null) {
            return "Hello, " + lastName;
        } else {
            return "Hello World";
        }
    }
    //method to save greeting
    public GreetingEntity saveGreeting(String id, String firstName, String lastName){
        String message;
        if (firstName != null && lastName != null) {
            message = "Hello, " + firstName + " " + lastName;
        } else if (firstName != null) {
            message = "Hello, " + firstName;
        } else if (lastName != null) {
            message = "Hello, " + lastName;
        } else {
            message = "Hello World";
        }
        GreetingEntity greetingEntity = new GreetingEntity(id, message, firstName, lastName);
        return greetingRepository.save(greetingEntity);
    }
    //method to search message by id
    public GreetingEntity findById(String id){
        return greetingRepository.findById(id).orElse(null);
    }
    // Method to list all greetings
    public List<GreetingEntity> getAllGreetings() {
        //get all message
        return greetingRepository.findAll();
    }
    //method to edit message
    public GreetingEntity editGreetingMessage(String id, String message){
        GreetingEntity greetingEntity = greetingRepository.findById(id).orElseThrow(() ->
                new RuntimeException("greeting not found"));

        //update message
        if(message != null){
            greetingEntity.setMessage(message);
        }
        //save updated message
        greetingRepository.save(greetingEntity);

        return greetingEntity;
    }
}