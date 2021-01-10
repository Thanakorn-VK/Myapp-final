package com.example.myapp;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class Test_Sort_by_Name_AtoZ {
    @Test
    public void Test_Sort_by_Name_1() {
        String[] a = {"Padthaiwithshrimp","ShrimpBasilFriedRice","Chickenbasilfriedrice"};
        String[] result = Ingredient.Sort_by_Name_AtoZ(a);
        String[] expected = {"Chickenbasilfriedrice","Padthaiwithshrimp","ShrimpBasilFriedRice"};
        assertArrayEquals(expected,result);
    }
    @Test
    public void Test_Sort_by_Name_2() {
        String[] a = {"Porkbasilfriedrice","Stirfriedmorningglory","MincedPorkBoiledRice","Eggfriedrice","Chickenrice"};
        String[] result = Ingredient.Sort_by_Name_AtoZ(a);
        String[] expected = {"Chickenrice","Eggfriedrice","MincedPorkBoiledRice","Porkbasilfriedrice","Stirfriedmorningglory"};
        assertArrayEquals(expected,result);
    }
    @Test
    public void Test_Sort_by_Name_3() {
        String[] a = {"Chickenrice","Friedporkbelly","ShrimpBasilFriedRice","Chickenbasilfriedrice"};
        String[] result = Ingredient.Sort_by_Name_AtoZ(a);
        String[] expected = {"Chickenbasilfriedrice","Chickenrice","Friedporkbelly","ShrimpBasilFriedRice"};
        assertArrayEquals(expected,result);
    }
    @Test
    public void Test_Sort_by_Name_4() {
        String[] a = {"Stirfriedmorningglory","ShrimpBasilFriedRice","Porkbasilfriedrice","Chickenrice","Eggfriedrice","MincedPorkBoiledRice"};
        String[] result = Ingredient.Sort_by_Name_AtoZ(a);
        String[] expected = {"Chickenrice","Eggfriedrice","MincedPorkBoiledRice","Porkbasilfriedrice","ShrimpBasilFriedRice","Stirfriedmorningglory"};
        assertArrayEquals(expected,result);
    }
}
