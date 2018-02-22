package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();

        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }

    @Test
    public void differenceFiveMinusTwoThreeReturned() {
        Calculator calculator = new Calculator();
        int difference = calculator.minus(5, 2);
        assertEquals(3, difference);
    }
}
