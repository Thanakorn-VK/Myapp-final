package com.example.myapp;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Test_Calculator_Calories_Male {
    @Test
    public void Test_Calculator_Calorie_Male_Should_2170() {
        double result = CalculatorCaloriesMale.Calculator_Calories_Male(70);
        double expected = 2170;
        assertEquals(expected,result,0.01f);
    }
    @Test
    public void Test_Calculator_Calorie_Male_Should_2015() {
        double result = CalculatorCaloriesMale.Calculator_Calories_Male(65);
        double expected = 2015;
        assertEquals(expected,result,0.01f);
    }
    @Test
    public void Test_Calculator_Calorie_Male_Should_0() {
        double result = CalculatorCaloriesMale.Calculator_Calories_Male(1000000);
        double expected = 0;
        assertEquals(expected,result,0.01f);
    }
    @Test
    public void Test_Calculator_Calorie_Male_Should_0_1() {
        double result = CalculatorCaloriesMale.Calculator_Calories_Male(0);
        double expected = 0;
        assertEquals(expected,result,0.01f);
    }
    @Test
    public void Test_Calculator_Calorie_Male_Should_0_2() {
        double result = CalculatorCaloriesMale.Calculator_Calories_Male(-1000000);
        double expected = 0;
        assertEquals(expected,result,0.01f);
    }
}
