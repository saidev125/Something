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
        assertEquals(1, calculator.operation(3, 2, "subs"));
    }

    @Test
    public void testMult() {
        assertEquals(6, calculator.operation(2, 3, "mult"));
    }

    @Test
    public void testDiv() {
        assertEquals(3, calculator.operation(6, 2, "div"));
    }
}
