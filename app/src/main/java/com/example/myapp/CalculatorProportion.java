package com.example.myapp;

public class CalculatorProportion {

    public double[] Calculate_Proportion(double Cal){

        CalculatorNutrient cal = new CalculatorNutrient();
        double list[] = new double[3];
        list[0] = cal.Protein(Cal);
        list[1] = cal.Crabohydrate(Cal);
        list[2] = cal.Fat(Cal);
        return list;
    }
}
