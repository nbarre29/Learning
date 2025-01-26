package com.naveen.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int result = calculator.square(4); // Calls the private method indirectly
        assertEquals(16, result, "The square of 4 should be 16");
    }


    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(4, 5); // Calls the public method
        assertEquals(9, result, "The sum of 4 and 5 should be 9");
    }
}

