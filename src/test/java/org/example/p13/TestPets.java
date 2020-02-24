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
        Mockito.when(mockMouse.getStrength()).thenReturn(1);
        Mockito.when(mockMouse.getName()).thenReturn("Mikky");

        Dog mockDog = Mockito.mock(Dog.class);
        Mockito.when(mockDog.getStrength()).thenReturn(3);
        Mockito.when(mockDog.getName()).thenReturn("Bobik");


        ApplicationContext ctx = new AnnotationConfigApplicationContext
                (AppConfiguration.class);
        Cat cat = ctx.getBean("cat", Cat.class);

        assertEquals("Кошка побеждает мышь.", cat.fight(mockMouse), 1);
        assertEquals("Кошка проигрывает собаке.", cat.fight(mockDog), -1);
        assertEquals("Кошка побеждает мышь.", cat.fight(cat), 0);

        Mockito.when(mockDog.fight(cat)).thenReturn(1);
        Mockito.when(mockDog.fight(mockMouse)).thenReturn(1);

        assertEquals("Собака побеждает кошку.", mockDog.fight(cat), 1);
        assertEquals("Собака побеждает мышь.", mockDog.fight(mockMouse), 1);
    }
}