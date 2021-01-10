package com.example.myapp;

public class CalculatorNutrient {
    public double Protein(double Cal){
        if(Cal < 0) return 0;
        return (0.25*Cal)/4;
    }

    public double Crabohydrate(double Cal){
        if(Cal < 0) return 0;
        return (0.50*Cal)/4;
    }

    public double Fat(double Cal){
        if(Cal < 0) return 0;
        return (0.25*Cal)/9;
    }
}
