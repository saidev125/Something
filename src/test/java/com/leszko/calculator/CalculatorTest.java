package com.leszko.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(5, calculator.operation(2, 3, "add"));
    }

    @Test
    public void testSubs() {
        assertEquals(5, calculator.operation(2, 3, "subs"));
    }

    @Test
    public void testMult() {
        assertEquals(5, calculator.operation(2, 3, "mult"));
    }

    @Test
    public void testDiv() {
        assertEquals(5, calculator.operation(2, 3, "div"));
    }
}