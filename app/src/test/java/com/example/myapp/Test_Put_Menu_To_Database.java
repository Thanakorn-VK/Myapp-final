package com.example.myapp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class Test_Put_Menu_To_Database {
    @InjectMocks
    GetInput mock;

    @Mock
    Firebase mockfake;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void Test_Put_Menu_To_Database_Should_true(){
        when(mockfake.Putdata(anyString())).thenReturn(true);
        boolean expected = true;
        boolean result = mock.PutNametoDatabase("Chickenbasilfriedrice");
        assertEquals(expected,result);
    }
    @Test
    public void Test_Put_Menu_To_Database_Should_false(){
        when(mockfake.Putdata(anyString())).thenReturn(false);
        boolean expected = false;
        boolean result = mock.PutNametoDatabase("Chickenbasilfriedrice");
        assertEquals(expected,result);
    }
}
