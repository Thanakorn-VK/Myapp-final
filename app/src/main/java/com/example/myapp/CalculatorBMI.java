package com.example.myapp;

public class CalculatorBMI {
    FindBMI find = new FindBMI();
    public String Calculator(double weight,double high){
        double a = weight/(high*high);
        return find.SelectBMI(a);
    }
}
