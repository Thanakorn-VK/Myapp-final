package com.example.myapp;

public class GetInput {
    Firebase firebase = new Firebase();
    public String Get_Input_Form_DB(String way){
        String str = "";
        str = firebase.getData("Gralic");
        return str;
    }

    public String Get_Menu_Form_DB(String way){
        String str = "";
        str = firebase.getMenu("Padthai");
        return str;
    }
    public String SearchNemu(String nemu){
        String str = "";
        str = firebase.Searchdatabase("Padthai");
        return str;
    }
    public boolean PutNametoDatabase(String name){
        boolean state = false;
        state = firebase.Putdata(name);
        return state;
    }
}
