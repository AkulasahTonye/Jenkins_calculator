package com.example.Jenkins_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private calculator calculator = new calculator();

    @Test
     void addTest() {
        assertEquals(5, calculator.sum(2,3));
    }
}
