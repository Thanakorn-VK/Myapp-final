package com.example.myapp;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class Test_Count_List {
    @InjectMocks
    CountMenu mock;

    @Mock
    Firebase mockfake;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void Test_Count_Form_List_Should_5(){
        when(mockfake.Count(any(String[].class))).thenReturn(5);
        int expected = 5;
        String[] a = {"Chickenbasilfriedrice","Chickenrice","Friedporkbelly","ShrimpBasilFriedRice"};
        int result = mock.CountMenuFormList(a);
        assertEquals(expected,result);
    }
    @Test
    public void Test_Count_Form_List_Should_3(){
        when(mockfake.Count(any(String[].class))).thenReturn(3);
        int expected = 3;
        String[] a = {"Chickenbasilfriedrice","Chickenrice","Friedporkbelly","ShrimpBasilFriedRice"};
        int result = mock.CountMenuFormList(a);
        assertEquals(expected,result);
    }
    @Test
    public void Test_Count_Form_List_Should_8(){
        when(mockfake.Count(any(String[].class))).thenReturn(8);
        int expected = 8;
        String[] a = {"Chickenbasilfriedrice","Chickenrice","Friedporkbelly","ShrimpBasilFriedRice"};
        int result = mock.CountMenuFormList(a);
        assertEquals(expected,result);
    }
    @Test
    public void Test_Count_Form_List_Should_2(){
        when(mockfake.Count(any(String[].class))).thenReturn(2);
        int expected = 2;
        String[] a = {"Chickenbasilfriedrice","Chickenrice","Friedporkbelly","ShrimpBasilFriedRice"};
        int result = mock.CountMenuFormList(a);
        assertEquals(expected,result);
    }

}
