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

public class Test_Calculator_BMI {
    @InjectMocks
    CalculatorBMI mock;

    @Mock
    FindBMI mockfake;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void Test_Calculator_BMI_Should_Thin(){
        when(mockfake.SelectBMI(anyDouble())).thenReturn("Thin");
        String expected = "Thin";
        String result = mock.Calculator(50.00,166.00);
        assertEquals(expected,result);
    }

    @Test
    public void Test_Calculator_BMI_Should_Good(){
        when(mockfake.SelectBMI(anyDouble())).thenReturn("Good");
        String expected = "Good";
        String result = mock.Calculator(82.00,140.00);
        assertEquals(expected,result);
    }

    @Test
    public void Test_Calculator_BMI_Should_Normal(){
        when(mockfake.SelectBMI(anyDouble())).thenReturn("Normal");
        String expected = "Normal";
        String result = mock.Calculator(82.00,140.00);
        assertEquals(expected,result);
    }

    @Test
    public void Test_Calculator_BMI_Should_Fat(){
        when(mockfake.SelectBMI(anyDouble())).thenReturn("Fat");
        String expected = "Fat";
        String result = mock.Calculator(82.00,140.00);
        assertEquals(expected,result);
    }

    @Test
    public void Test_Calculator_BMI_Should_VeryFat(){
        when(mockfake.SelectBMI(anyDouble())).thenReturn("VeryFat");
        String expected = "VeryFat";
        String result = mock.Calculator(82.00,140.00);
        assertEquals(expected,result);
    }
}
