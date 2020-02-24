package org.example.p13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext
                (AppConfiguration.class);
        Cat cat = ctx.getBean("cat", Cat.class);
        Mouse mouse = ctx.getBean("mouse", Mouse.class);
        Dog dog = ctx.getBean("dog", Dog.class);

        cat.fight(dog);
        cat.fight(mouse);
        dog.fight(mouse);
    }

}
