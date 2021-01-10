package com.example.myapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_Calculator_Calorie {
    @Test
    public void Test_Calculator_Calorie_Should_1650() {
        double Protein = 100;
        double Carbohydrate = 200;
        double Fat = 50;
        double result = CalculatorCalorie.Calculator_Calorie(Protein,Carbohydrate,Fat);
        double expected = 1650;
        assertEquals(expected,result,0.01f);
    }
    @Test
    public void Test_Calculator_Calorie_Should_17000() {
        double Protein = 1000;
        double Carbohydrate = 1000;
        double Fat = 1000;
        double result = CalculatorCalorie.Calculator_Calorie(Protein,Carbohydrate,Fat);
        double expected = 17000;
        assertEquals(expected,result,0.01f);
    }
    @Test
    public void Test_Calculator_Calorie_Should_0() {
        double Protein = -10000;
        double Carbohydrate = -10000;
        double Fat = -10000;
        double result = CalculatorCalorie.Calculator_Calorie(Protein,Carbohydrate,Fat);
        double expected = 0;
        assertEquals(expected,result,0.01f);
    }
}
