package com.example.myapp;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class Test_SearchName {
    @InjectMocks
    GetInput mock;

    @Mock
    Firebase mockfake;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void Test_Search_Menu_Form_DB_Should_Porkbasilfriedrice(){
        when(mockfake.Searchdatabase(anyString())).thenReturn("Porkbasilfriedrice");
        String expected = "Porkbasilfriedrice";
        String result = mock.SearchNemu("Porkbasilfriedrice");
        assertEquals(expected,result);
    }
    @Test
    public void Test_Search_Menu_Form_DB_Should_MincedPorkBoiledRice(){
        when(mockfake.Searchdatabase(anyString())).thenReturn("MincedPorkBoiledRic");
        String expected = "MincedPorkBoiledRic";
        String result = mock.SearchNemu("MincedPorkBoiledRic");
        assertEquals(expected,result);
    }
    @Test
    public void Test_Search_Menu_Form_DB_Should_Chickenrice(){
        when(mockfake.Searchdatabase(anyString())).thenReturn("Chickenrice");
        String expected = "Chickenrice";
        String result = mock.SearchNemu("Chickenrice");
        assertEquals(expected,result);
    }
    @Test
    public void Test_Search_Menu_Form_DB_Should_Stirfriedmorningglory(){
        when(mockfake.Searchdatabase(anyString())).thenReturn("Stirfriedmorningglory");
        String expected = "Stirfriedmorningglory";
        String result = mock.SearchNemu("Stirfriedmorningglory");
        assertEquals(expected,result);
    }
}
