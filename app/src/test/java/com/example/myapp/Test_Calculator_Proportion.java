package com.example.myapp;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.when;

public class Test_Calculator_Proportion {
    @InjectMocks
    CalculatorProportion mockTest;
    @Mock
    CalculatorNutrient mockfake;
    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public final void Test_Calculator_Array_Calorie(){
        when(mockfake.Crabohydrate(anyDouble())).thenReturn(337.00);
        when(mockfake.Protein(anyDouble())).thenReturn(168.00);
        when(mockfake.Fat(anyDouble())).thenReturn(75.00);

        double[] expected = {168.00,337.00,75.00};
        double[] result = mockTest.Calculate_Proportion(2700.00);
        assertArrayEquals(expected,result,1f);
    }
    @Test
    public final void Test_Calculator_Array_Calorie2(){
        when(mockfake.Crabohydrate(anyDouble())).thenReturn(375.00);
        when(mockfake.Protein(anyDouble())).thenReturn(187.50);
        when(mockfake.Fat(anyDouble())).thenReturn(83.33);

        double[] expected = {187.50,375.00,83.33};
        double[] result = mockTest.Calculate_Proportion(3000.00);
        assertArrayEquals(expected,result,1f);
    }
    @Test
    public final void Test_Calculator_Array_Calorie_Should_0(){
        when(mockfake.Crabohydrate(anyDouble())).thenReturn(375.00);
        when(mockfake.Protein(anyDouble())).thenReturn(187.50);
        when(mockfake.Fat(anyDouble())).thenReturn(83.33);

        double[] expected = {0,0,0};
        double[] result = mockTest.Calculate_Proportion(0);
        assertArrayEquals(expected,result,1f);
    }
}
