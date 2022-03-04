package com.yasincuren.javalearning2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args){

        //Arrays

        String[] myStringArray = new String[3];
        myStringArray[0]= "Ender";
        myStringArray[1]= "Yasin";
        myStringArray[2]= "Çüren";
        //System.out.println(myStringArray[1]);

        int[] myIntegerArray = new int[3];
        myIntegerArray[0]= 10;
        myIntegerArray[1]= 20;
        myIntegerArray[2]= 30;
        //System.out.println(myIntegerArray[1]);

        int[] myNumbers = {0,1,2,3,4};
        //System.out.println(myNumbers[2]);


        //Lists

        ArrayList<String> myNameList = new ArrayList<>();

        myNameList.add("Ender");
        myNameList.add(1,"Yasin");
        myNameList.add("Çüren");

        System.out.println(myNameList.get(0));
        System.out.println(myNameList.get(1));
        System.out.println(myNameList.get(2));


        //Set

        HashSet<String> mySet = new HashSet<String>();
        mySet.add("James");
        mySet.add("James");
        System.out.println(mySet.size());


        //Map

        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("run",100);
        myMap.put("basketball",200);
        System.out.println(myMap.get("run"));


    }
}
