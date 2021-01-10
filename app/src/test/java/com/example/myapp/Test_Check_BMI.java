package com.example.myapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_Check_BMI {
    @Test
    public void Test_Check_BMI_Should_0() {
        FindBMI find = new FindBMI();
        String result = find.SelectBMI(-20.00);
        String expected = null;
        assertEquals(expected,result);
    }
    @Test
    public void Test_Check_BMI_Should_Thin() {
        FindBMI find = new FindBMI();
        String result = find.SelectBMI(17.00);
        String expected = "Thin";
        assertEquals(expected,result);
    }
    @Test
    public void Test_Check_BMI_Should_Good() {
        FindBMI find = new FindBMI();
        String result = find.SelectBMI(19.00);
        String expected = "Good";
        assertEquals(expected,result);
    }
    @Test
    public void Test_Check_BMI_Should_Normal() {
        FindBMI find = new FindBMI();
        String result = find.SelectBMI(23.00);
        String expected = "Normal";
        assertEquals(expected,result);
    }
    @Test
    public void Test_Check_BMI_Should_Fat() {
        FindBMI find = new FindBMI();
        String result = find.SelectBMI(26.00);
        String expected = "Fat";
        assertEquals(expected,result);
    }
    @Test
    public void Test_Check_BMI_Should_VeryFat() {
        FindBMI find = new FindBMI();
        String result = find.SelectBMI(33.00);
        String expected = "VeryFat";
        assertEquals(expected,result);
    }
}
