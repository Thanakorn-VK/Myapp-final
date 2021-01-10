package com.example.myapp;

public class CalculatorCaloriesMale {
    public static double Calculator_Calories_Male(double wight){
        if(wight < 0) return 0;
        else if(wight > 600) return 0;
        double result = 0;
        result = wight * 31;
        return result;
    }
}