package com.example.myapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_Fat_Calculator {
    @Test
    public void Test_Fat_Calculator_Should_3000() {
        CalculatorNutrient Cal = new CalculatorNutrient();
        double result = Cal.Fat(3000.00);
        double expected = (0.25*3000.00)/9;
        assertEquals(expected,result,1f);
    }
    @Test
    public void Test_Fat_Calculator_Should_10000() {
        CalculatorNutrient Cal = new CalculatorNutrient();
        double result = Cal.Fat(10000.00);
        double expected = (0.25*10000.00)/9;
        assertEquals(expected,result,1f);
    }
    @Test
    public void Test_Fat_Calculator_Should_1700() {
        CalculatorNutrient Cal = new CalculatorNutrient();
        double result = Cal.Fat(1700.00);
        double expected = (0.25*1700.00)/9;
        assertEquals(expected,result,1f);
    }
    @Test
    public void Test_Fat_Calculator_Nagative_Should_0() {
        CalculatorNutrient Cal = new CalculatorNutrient();
        double result = Cal.Fat(-5000.00);
        double expected = 0;
        assertEquals(expected,result,1f);
    }
}
