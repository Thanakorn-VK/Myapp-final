package com.example.myapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_Calculator_Calories_Female {
    @Test
    public void Test_Calculator_Calorie_Female_Should_45() {
        double result = CalculatorCaloriesFemale.Calculator_Calories_Female(45);
        double expected = 1215;
        assertEquals(expected,result,0.01f);
    }
    @Test
    public void Test_Calculator_Calorie_Female_Should_50() {
        double result = CalculatorCaloriesFemale.Calculator_Calories_Female(50);
        double expected = 1350;
        assertEquals(expected,result,0.01f);
    }
    @Test
    public void Test_Calculator_Calorie_Female_Should_0() {
        double result = CalculatorCaloriesFemale.Calculator_Calories_Female(2000000);
        double expected = 0;
        assertEquals(expected,result,0.01f);
    }
    @Test
    public void Test_Calculator_Calorie_Female_Should_0_1() {
        double result = CalculatorCaloriesFemale.Calculator_Calories_Female(0);
        double expected = 0;
        assertEquals(expected,result,0.01f);
    }
    @Test
    public void Test_Calculator_Calorie_Female_Should_0_2() {
        double result = CalculatorCaloriesFemale.Calculator_Calories_Female(-500);
        double expected = 0;
        assertEquals(expected,result,0.01f);
    }
}
