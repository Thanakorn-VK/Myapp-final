package com.example.myapp;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class Test_Get_Menu_Form_DB {
    @InjectMocks
    GetInput mock;

    @Mock
    Firebase mockfake;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void Test_Get_Menu_Form_DB_Should_Friedporkbelly(){
        when(mockfake.getMenu(anyString())).thenReturn("Friedporkbelly");
        String expected = "Friedporkbelly";
        String result = mock.Get_Menu_Form_DB("Friedporkbelly");
        assertEquals(expected,result);
    }
    @Test
    public void Test_Get_Menu_Form_DB_Should_MincedPorkBoiledRice(){
        when(mockfake.getMenu(anyString())).thenReturn("MincedPorkBoiledRic");
        String expected = "MincedPorkBoiledRic";
        String result = mock.Get_Menu_Form_DB("MincedPorkBoiledRic");
        assertEquals(expected,result);
    }
    @Test
    public void Test_Get_Menu_Form_DB_Should_Porkbasilfriedrice(){
        when(mockfake.getMenu(anyString())).thenReturn("Porkbasilfriedrice");
        String expected = "Porkbasilfriedrice";
        String result = mock.Get_Menu_Form_DB("Porkbasilfriedrice");
        assertEquals(expected,result);
    }
    @Test
    public void Test_Get_Menu_Form_DB_Should_Stirfriedmorningglory(){
        when(mockfake.getMenu(anyString())).thenReturn("Stirfriedmorningglory");
        String expected = "Stirfriedmorningglory";
        String result = mock.Get_Menu_Form_DB("Stirfriedmorningglory");
        assertEquals(expected,result);
    }
}
