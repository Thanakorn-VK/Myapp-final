package com.example.myapp;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class Test_Sort_by_Name_ZtoA {
    @Test
    public void Test_reversSort_by_Name_1() {
        String[] a = {"Padthaiwithshrimp","ShrimpBasilFriedRice","Chickenbasilfriedrice"};
        String[] result = Ingredient.Sort_by_Name_ZtoA(a);
        String[] expected = {"ShrimpBasilFriedRice","Padthaiwithshrimp","Chickenbasilfriedrice"};
        assertArrayEquals(expected,result);
    }
    @Test
    public void Test_reversSort_by_Name_2() {
        String[] a = {"Porkbasilfriedrice","Stirfriedmorningglory","MincedPorkBoiledRice","Eggfriedrice","Chickenrice"};
        String[] result = Ingredient.Sort_by_Name_ZtoA(a);
        String[] expected = {"Stirfriedmorningglory","Porkbasilfriedrice","MincedPorkBoiledRice","Eggfriedrice","Chickenrice"};
        assertArrayEquals(expected,result);
    }
    @Test
    public void Test_reversSort_by_Name_3() {
        String[] a = {"Chickenrice","Friedporkbelly","ShrimpBasilFriedRice","Chickenbasilfriedrice"};
        String[] result = Ingredient.Sort_by_Name_ZtoA(a);
        String[] expected = {"ShrimpBasilFriedRice","Friedporkbelly","Chickenrice","Chickenbasilfriedrice"};
        assertArrayEquals(expected,result);
    }
    @Test
    public void Test_reversSort_by_Name_4() {
        String[] a = {"Stirfriedmorningglory","ShrimpBasilFriedRice","Porkbasilfriedrice","Chickenrice","Eggfriedrice","MincedPorkBoiledRice"};
        String[] result = Ingredient.Sort_by_Name_ZtoA(a);
        String[] expected = {"Stirfriedmorningglory","ShrimpBasilFriedRice","Porkbasilfriedrice","MincedPorkBoiledRice","Eggfriedrice","Chickenrice"};
        assertArrayEquals(expected,result);
    }
}