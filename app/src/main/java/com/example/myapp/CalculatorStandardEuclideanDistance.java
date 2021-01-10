package com.example.myapp;

public class CalculatorStandardEuclideanDistance {
    public double Calculator_Standard_Euclidean_Distance(double n,double[] X, double[] Y){
        double result = 0;
        for(int i = 0 ; i < n ; i++){
            result = result + Math.pow((X[i]-Y[i]),2);
        }
        result = Math.sqrt(result);
        return result;
    }
}
