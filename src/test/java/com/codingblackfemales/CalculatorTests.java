package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("add one negative and one positive")
    public void testAdditionPosNeg() {
        final Integer sum = Calculator.add(-7, 3);

        assertEquals(-4, sum);
    }

    @Test
    @DisplayName("add two negative numbers")
    public void testAdditionNeg() {
        final Integer sum = Calculator.add(-4, -5);

        assertEquals(-9, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test
    @DisplayName("subtract one positive and one negative")
    public void testSubtractionPosNeg() {
        final Integer difference = Calculator.subtract(-6, 4);

        assertEquals(-10, difference);
    }

    @Test
    @DisplayName("subtract two negative numbers")
    public void testSubtractionNeg() {
        final Integer difference = Calculator.subtract(-14, -6);

        assertEquals(-8, difference);
    }

    @Test
    @DisplayName("multiply two positive numbers")
    public void testMultiplication() {
        final Integer product = Calculator.multiply(5, 4);

        assertEquals(20, product);
    }

    @Test
    @DisplayName("multiply a negative and a positive number")
    public void testMultiplicationPosNeg() {
        final Integer product = Calculator.multiply(-3, 4);

        assertEquals(-12, product);
    }

    @Test
    @DisplayName("multiply two negative numbers")
    public void testMultiplicationNeg() {
        final Integer product = Calculator.multiply(-3, -3);

        assertEquals(9, product);
    }


    @Test
    @DisplayName("divide two positive numbers")
    public void testDivision() {
        final Integer quotient = Calculator.divide(20, 4);

        assertEquals(5, quotient);
    }

    @Test
    @DisplayName("divide a negative and a positive number")
    public void testDivisionPosNeg() {
        final Integer quotient = Calculator.divide(-24, 4);

        assertEquals(-6, quotient);
    }

    @Test
    @DisplayName("divide two negative numbers")
    public void testDivisionNeg() {
        final Integer quotient = Calculator.divide(-30, -5);

        assertEquals(6, quotient);
    }

}
