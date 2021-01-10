package com.example.myapp;

public class CalculatorCalorie {
    public static double Calculator_Calorie(double Protein,double Carbohydrate, double Fat){ // กรัม
        double result = 0;
        double CalorieProtein = 4 * Protein;
        double CalorieCarbohydrate = 4 * Carbohydrate;
        double CalorieFat = 9 * Fat;
        result = CalorieCarbohydrate + CalorieFat + CalorieProtein;
        if(result > 0) return result;
        else return 0;
    }
}
