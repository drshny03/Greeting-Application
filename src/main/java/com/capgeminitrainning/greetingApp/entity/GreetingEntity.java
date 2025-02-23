package com.capgeminitrainning.greetingApp.entity;

import jakarta.persistence.*;

//entity class for greeting
@Entity
@Table(name = "greeting")
public class GreetingEntity {
    //attributes
    @Id
    private String id;

    private String message;
    private String firstName;
    private String lastName;

    //constructor
    public GreetingEntity(){}

    public GreetingEntity(String id, String message, String firstName, String lastName) {
        this.id = id;
        this.message = message;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getter and setter
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}