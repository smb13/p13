package org.example.p13;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public Cat cat() {
        return new Cat("Vasya");
    }

    @Bean
    public Mouse mouse() {
        return new Mouse("Mikky");
    }

    @Bean
    public Dog dog() {
        return new Dog("Bobik");
    }
}

