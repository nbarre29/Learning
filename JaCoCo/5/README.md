$ mvn clean test

# view report at 'target/site/jacoco/index.html


In Java, private methods cannot be directly tested because they are not accessible outside their containing class. However, private methods are typically tested indirectly by testing the public methods that call them. If you specifically want to test private methods, you can use reflection, but this is generally discouraged as it violates encapsulation principles.

Let's create a class Calculator with a private method and a public method that calls it.

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


In this example:

    The multiply method is private and cannot be tested directly.
    The square method is public and uses multiply. Testing square indirectly tests multiply.
	


	
1) JUnit Test Case for Public Method

Here’s a test case for the square method, which indirectly tests the private multiply method.
CalculatorTest.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int result = calculator.square(4); // Calls the private method indirectly
        assertEquals(16, result, "The square of 4 should be 16");
    }
}



2) JUnit Test Case for Private Method (Using Reflection)

If you must test the private method directly (not recommended), you can use reflection:

 @Test
    public void testPrivateMultiply() throws Exception {
        Calculator calculator = new Calculator();

        // Access the private method using reflection
        Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true); // Make the private method accessible

        // Invoke the private method
        int result = (int) multiplyMethod.invoke(calculator, 3, 5);
        assertEquals(15, result, "The multiplication of 3 and 5 should be 15");
    }
	
	
Explanation

    Indirect Testing:
        The testSquare method tests the private multiply method indirectly through the public square method. This approach adheres to encapsulation principles.

    Direct Testing Using Reflection:
        The testPrivateMultiply method uses reflection to access and test the private multiply method.
        Drawbacks:
            Reflection bypasses encapsulation, which can lead to brittle tests.
            It's generally better to test private methods through their public interface.

Best Practices

    Favor Indirect Testing: Test private methods via public methods that use them.
    Keep Private Methods Simple: Private methods should generally have limited complexity and be part of the implementation detail of public methods.
    Avoid Reflection Unless Necessary: Use reflection only when absolutely required, such as in legacy code testing scenarios.







