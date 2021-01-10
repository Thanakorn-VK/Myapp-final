package com.example.myapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_Protein_Calculator {

    @Test
    public void Test_Protein_Calculator_Should_375() {
        CalculatorNutrient Cal = new CalculatorNutrient();
        double result = Cal.Protein(6000.00);
        double expected = (0.25*6000.00)/4;
        assertEquals(expected,result,1f);
    }
    @Test
    public void Test_Protein_Calculator_Should_556() {
        CalculatorNutrient Cal = new CalculatorNutrient();
        double result = Cal.Protein(8900.00);
        double expected = (0.25*8900.00)/4;
        assertEquals(expected,result,1f);
    }
    @Test
    public void Test_Protein_Calculator_Should_156() {
        CalculatorNutrient Cal = new CalculatorNutrient();
        double result = Cal.Protein(2500.00);
        double expected = (0.25*2500.00)/4;
        assertEquals(expected,result,1f);
    }
    @Test
    public void Test_Protein_Calculator_Nagative_Should_0() {
        CalculatorNutrient Cal = new CalculatorNutrient();
        double result = Cal.Protein(-8200.00);
        double expected = 0;
        assertEquals(expected,result,1f);
    }
}
