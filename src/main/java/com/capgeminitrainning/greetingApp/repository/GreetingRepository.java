package com.capgeminitrainning.greetingApp.repository;


import com.capgeminitrainning.greetingApp.entity.GreetingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.print.DocFlavor;

@Repository
public interface GreetingRepository extends JpaRepository<GreetingEntity, String> {
}