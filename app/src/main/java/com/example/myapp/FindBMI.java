package com.example.myapp;

public class FindBMI {
    public String SelectBMI(double value){
        if(value < 0) return null;
        else if(value < 18.50) return "Thin";
        else if(value < 22.90) return "Good";
        else if(value < 24.90) return "Normal";
        else if(value < 29.90) return "Fat";
        else return "VeryFat";
    }
}
