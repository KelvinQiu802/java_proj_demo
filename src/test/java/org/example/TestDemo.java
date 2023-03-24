package org.example;

import org.example.Cat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDemo {
    @Test
    public void test() {
        Cat c = new Cat("Kelvin");
        assertEquals("Kelvin", c.getName());
    }
}
