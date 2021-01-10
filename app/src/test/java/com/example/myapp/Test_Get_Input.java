package com.example.myapp;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class Test_Get_Input {
    @InjectMocks
    GetInput mock;

    @Mock
    Firebase mockfake;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void Test_Get_Input_Should_Tomato(){
        when(mockfake.getData(anyString())).thenReturn("Tomato");
        String expected = "Tomato";
        String result = mock.Get_Input_Form_DB("Tomato");
        assertEquals(expected,result);
    }
    @Test
    public void Test_Get_Input_Should_Gralic(){
        when(mockfake.getData(anyString())).thenReturn("Gralic");
        String expected = "Gralic";
        String result = mock.Get_Input_Form_DB("Gralic");
        assertEquals(expected,result);
    }
    @Test
    public void Test_Get_Input_Should_Carrot(){
        when(mockfake.getData(anyString())).thenReturn("Carrot");
        String expected = "Carrot";
        String result = mock.Get_Input_Form_DB("Carrot");
        assertEquals(expected,result);
    }
    @Test
    public void Test_Get_Input_Should_Chili(){
        when(mockfake.getData(anyString())).thenReturn("Chili");
        String expected = "Chili";
        String result = mock.Get_Input_Form_DB("Chili");
        assertEquals(expected,result);
    }
}
