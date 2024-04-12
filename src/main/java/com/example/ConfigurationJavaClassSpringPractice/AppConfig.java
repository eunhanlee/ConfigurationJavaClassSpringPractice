package com.example.ConfigurationJavaClassSpringPractice;

import com.example.ConfigurationJavaClassSpringPractice.models.Animal;
import com.example.ConfigurationJavaClassSpringPractice.models.Owner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public Animal animal(Owner owner) {
        Animal animal = new Animal();
        animal.setOwner(owner);
        return animal;
    }
    @Bean
    @Scope("prototype")
    public Owner owner() {
        return new Owner("defaultName",0);
    }
}

