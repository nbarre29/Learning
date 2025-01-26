package com.naveen.examples;

public class Calculator {
    // Public method
    public int add(int a, int b) {
        return a + b;
    }

    // Private method
    private int multiply(int a, int b) {
        return a * b;
    }

    // Public method that uses the private method
    public int square(int a) {
        return multiply(a, a);
    }
}

