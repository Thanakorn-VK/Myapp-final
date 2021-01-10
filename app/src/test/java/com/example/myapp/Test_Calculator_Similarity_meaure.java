package com.example.myapp;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.when;

public class Test_Calculator_Similarity_meaure {
    @InjectMocks
    Ingredient mockIngredient;
    @Mock
    CalculatorStandardEuclideanDistance mock;
    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public final void Test_Calculator_Porkbasilfriedrice(){
        when(mock.Calculator_Standard_Euclidean_Distance(anyDouble(),any(double[].class),any(double[].class))).thenReturn(0.5);

        double[] X = {0.5,0.5,0.5,0.5};
        double[] Y = {0.5,0.5,0.5,0};
        double expected = 0.66;
        double result = mockIngredient.Calculator_Similarity_meaure(4,X,Y);
        assertEquals(expected,result,0.01f);
    }
    @Test
    public final void Test_Calculator_MincedPorkBoiledRice(){
        when(mock.Calculator_Standard_Euclidean_Distance(anyDouble(),any(double[].class),any(double[].class))).thenReturn(0.78);

        double[] X = {0.5,0.5,0.5,0.5};
        double[] Y = {0.5,0.5,0.5,0};
        double expected = 0.56;
        double result = mockIngredient.Calculator_Similarity_meaure(4,X,Y);
        assertEquals(expected,result,0.01f);
    }
    @Test
    public final void Test_Calculator_Friedporkbelly(){
        when(mock.Calculator_Standard_Euclidean_Distance(anyDouble(),any(double[].class),any(double[].class))).thenReturn(0.65);

        double[] X = {0.5,0.5,0.5,0.5};
        double[] Y = {0.5,0.5,0.5,0};
        double expected = 0.60;
        double result = mockIngredient.Calculator_Similarity_meaure(4,X,Y);
        assertEquals(expected,result,0.01f);
    }
}


