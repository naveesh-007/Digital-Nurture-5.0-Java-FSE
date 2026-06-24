package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    Calculator calc = new Calculator();

    @Test
    void testCalculatorWorking() {
        assertEquals(5, calc.add(2, 3));
    }
}