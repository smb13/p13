package org.example.p13;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.springframework.test.util.AssertionErrors.*;

public class TestPets {

    @Test
    public void TestPetsFight () {
        Mouse mockMouse = Mockito.mock(Mouse.class);
        Mockito.when(mockMouse.getStrength()).thenReturn(10);
        Mockito.when(mockMouse.getName()).thenReturn("mockMikky");

        ApplicationContext ctx = new AnnotationConfigApplicationContext
                (AppConfiguration.class);
        Cat cat = ctx.getBean("cat", Cat.class);
        Dog dog = ctx.getBean("dog", Dog.class);

//        cat.fight(mockMouse);
//        dog.fight(mockMouse);

        assertEquals("Мышь побеждает кошку.", cat.fight(mockMouse), -1);
        assertEquals("Мышь побеждает собаку.", dog.fight(mockMouse), -1);
    }


}