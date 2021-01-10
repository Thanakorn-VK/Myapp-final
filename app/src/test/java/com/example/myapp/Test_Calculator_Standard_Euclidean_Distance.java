package com.example.myapp;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test_Calculator_Standard_Euclidean_Distance {
    @Test
    public void Test_Calculator_Porkbasilfriedrice() {
        CalculatorStandardEuclideanDistance cal = new CalculatorStandardEuclideanDistance();
        double[] X = {0.5,0.5,0.5,0.5};
        double[] Y = {0.5,0.5,0.5,0};
        double result = cal.Calculator_Standard_Euclidean_Distance(4,X,Y);
        double expected = 0.5;
        assertEquals(expected,result,0.01f);
    }
    @Test
    public void Test_Calculator_MincedPorkBoiledRice() {
        CalculatorStandardEuclideanDistance cal = new CalculatorStandardEuclideanDistance();
        double[] X = {0.5,0.5,0.5,0.5};
        double[] Y = {0,0.5,0.5,0};
        double result = cal.Calculator_Standard_Euclidean_Distance(4,X,Y);
        double expected = 0.7;
        assertEquals(expected,result,0.01f);
    }
    @Test
    public void Test_Calculator_Friedporkbelly() {
        CalculatorStandardEuclideanDistance cal = new CalculatorStandardEuclideanDistance();
        double[] X = {0.5,0.5,0.5,0.5};
        double[] Y = {0,0,0.5,0};
        double result = cal.Calculator_Standard_Euclidean_Distance(4,X,Y);
        double expected = 0.86;
        assertEquals(expected,result,0.01f);
    }
}
