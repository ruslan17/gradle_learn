package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testSumPositive() {

        int expectedResult = 15;

        int actualResult = calculator.sum(5);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSumNegative() {

        int expectedResult = 0;

        int actualResult = calculator.sum(-5);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSumZero() {

        int expectedResult = 0;

        int actualResult = calculator.sum(0);

        assertEquals(expectedResult, actualResult);
    }

}