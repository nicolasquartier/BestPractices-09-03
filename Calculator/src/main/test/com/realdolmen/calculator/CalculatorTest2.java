package com.realdolmen.calculator;


import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest2 {

    @Test
    @Ignore
    public void testAddPositiveNumbers() {
        Calculator c = new Calculator();
        int result = c.add(5,5);
        assertEquals(10, result);
    }

    @Test
    @Ignore
    public void testAddNegativeNumbers() {
        Calculator c = new Calculator();
        int result = c.add(-5,-5);
        assertEquals(-10, result);
    }

    @Test
    @Ignore
    public void testAddPositiveNegativeNumbers() {
        Calculator c = new Calculator();
        int result = c.add(5,-5);
        assertEquals(0, result);
    }

    @Test
    @Ignore
    public void testAddNegativePositiveNumbers() {
        Calculator c = new Calculator();
        int result = c.add(-5,5);
        assertEquals(0, result);
    }

    @Test
    @Ignore
    public void testAddPosZero() {
        Calculator c = new Calculator();
        int result = c.add(5,0);
        assertEquals(5, result);
    }

    @Test
    @Ignore
    public void testAddNegZero() {
        Calculator c = new Calculator();
        int result = c.add(-5,0);
        assertEquals(-5, result);
    }

    @Test
    @Ignore
    public void testAddZeros() {
        Calculator c = new Calculator();
        int result = c.add(0,0);
        assertEquals(0, result);
    }

    @Test
    @Ignore
    public void testMultiplyPosNumbers() {
        Calculator c = new Calculator();
        int result = c.multiply(5,5);
        assertEquals(25, result);
    }

    @Test
    @Ignore
    public void testMultiplyNegNumbers() {
        Calculator c = new Calculator();
        int result = c.multiply(-5,-5);
        assertEquals(25, result);
    }

    @Test
    @Ignore
    public void testMultiplyPosNegNumbers() {
        Calculator c = new Calculator();
        int result = c.multiply(5,-5);
        assertEquals(-25, result);
    }

    @Test
    @Ignore
    public void testMultiplyNegPosNumbers() {
        Calculator c = new Calculator();
        int result = c.multiply(-5,5);
        assertEquals(-25, result);
    }

    @Test
    @Ignore
    public void testMultiplyZeros() {
        Calculator c = new Calculator();
        int result = c.multiply(0,5);
        assertEquals(0, result);
    }

    @Test
    @Ignore
    public void testDividePosNumbers() {
        Calculator c = new Calculator();
        int result = c.divide(5,5);
        assertEquals(1, result);
    }

    @Test
    @Ignore
    public void testDivideNegNumbers() {
        Calculator c = new Calculator();
        int result = c.divide(-5,-5);
        assertEquals(1, result);
    }

    @Test(expected = ArithmeticException.class)
    @Ignore
    public void testDivideZeros() {
        Calculator c = new Calculator();
        int result = c.divide(5,0);
        assertEquals(0, result);
    }

    @Test
    @Ignore
    public void testDivideShouldNotBeADouble() {
        Calculator c = new Calculator();
        int result = c.divide(2,3);
        assertEquals(0, result);
    }

    @Test
    public void testSqrtDouble() {
        Calculator c = new Calculator();
        double d = c.calculateSquareRoot(new PosDouble(144.0));
        assertEquals(12.0, d,0.00000001);
    }

    @Test(expected = ArithmeticException.class)
    public void testSqrtNegDouble() {
        Calculator c = new Calculator();
        double d = c.calculateSquareRoot(new PosDouble(-144.0));
        assertEquals(12.0, d,0.00000001);
    }
    //etc. etc. etc. etc.
}
