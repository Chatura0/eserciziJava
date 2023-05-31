package oppAdvanced._7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    /**
     * 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);
        assertEquals(5, result, "Error in add() method for positive numbers");

        result = calculator.add(-5, 7);
        assertEquals(2, result, "Error in add() method for negative numbers");

        result = calculator.add(0, 0);
        assertEquals(0, result, "Error in add() method for zero");

        result = calculator.subtract(10, 5);
        assertEquals(5, result, "Error in subtract() method for positive numbers");

        result = calculator.subtract(5, 10);
        assertEquals(-5, result, "Error in subtract() method for negative numbers");

        result = calculator.subtract(0, 0);
        assertEquals(0, result, "Error in subtract() method for zero");
    }

    /**
     * 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 3);
        Assertions.assertEquals(6, result, "Error in multiply() method for positive numbers");

        result = calculator.multiply(-4, 5);
        Assertions.assertEquals(-20, result, "Error in multiply() method for negative and positive numbers");

        result = calculator.multiply(-3, -2);
        Assertions.assertEquals(6, result, "Error in multiply() method for negative numbers");

        result = calculator.multiply(0, 10);
        Assertions.assertEquals(0, result, "Error in multiply() method for zero");

        result = calculator.divide(10, 2);
        Assertions.assertEquals(5, result, "Error in divide() method for positive numbers");

        result = calculator.divide(-20, 4);
        Assertions.assertEquals(-5, result, "Error in divide() method for negative and positive numbers");

        result = calculator.divide(-6, -3);
        Assertions.assertEquals(2, result, "Error in divide() method for negative numbers");

        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        Calculator calculator = new Calculator();

        double result = calculator.power(0, 0);
        Assertions.assertEquals(1, result);

        result = calculator.power(5, 0);
        Assertions.assertEquals(1, result);

        result = calculator.power(-2, 0);
        Assertions.assertEquals(1, result);

        result = calculator.power(0, 3);
        Assertions.assertEquals(0, result);

        result = calculator.power(2, 3);
        Assertions.assertEquals(8, result);

        result = calculator.power(-2, 4);
        Assertions.assertEquals(16, result);

        double decimalResult = calculator.power(0, -2);
        Assertions.assertEquals(Double.POSITIVE_INFINITY, decimalResult);

        decimalResult = calculator.power(2, -3);
        Assertions.assertEquals(0.125, decimalResult, 0.0001);

        decimalResult = calculator.power(-2, -2);
        Assertions.assertEquals(0.25, decimalResult, 0.0001);
    }

}
