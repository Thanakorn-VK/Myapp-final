package com.example.myapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_Crabohydrate_Calculator {
    @Test
    public void Test_Crabohydrate_Calculator_Should_375() {
        CalculatorNutrient Cal = new CalculatorNutrient();
        double result = Cal.Crabohydrate(3000.00);
        double expected = (0.50*3000.00)/4;
        assertEquals(expected,result,1f);
    }
    @Test
    public void Test_Crabohydrate_Calculator_Should_1250() {
        CalculatorNutrient Cal = new CalculatorNutrient();
        double result = Cal.Crabohydrate(10000.00);
        double expected = (0.50*10000.00)/4;
        assertEquals(expected,result,1f);
    }
    @Test
    public void Test_Crabohydrate_Calculator_Should_212() {
        CalculatorNutrient Cal = new CalculatorNutrient();
        double result = Cal.Crabohydrate(1700.00);
        double expected = (0.50*1700.00)/4;
        assertEquals(expected,result,1f);
    }
    @Test
    public void Test_Crabohydrate_Calculator_Nagative_Should_0() {
        CalculatorNutrient Cal = new CalculatorNutrient();
        double result = Cal.Crabohydrate(-5000.00);
        double expected = 0;
        assertEquals(expected,result,1f);
    }
}
