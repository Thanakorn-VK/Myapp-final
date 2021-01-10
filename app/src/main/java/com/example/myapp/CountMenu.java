package com.example.myapp;

public class CountMenu {
    Firebase firebase = new Firebase();
    public int CountMenuFormList(String[] List){
        int count = 0;
        count = firebase.Count(List);
        return count;
    }
}
