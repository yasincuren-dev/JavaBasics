package com.yasincuren.javalearning2;

public class Statements {

    public static void main(String[] args){

        //if statements

        /*
        int x= 20;
        int y= 30;

        if(x>y){
            System.out.println("x is bigger");
        } else if(y>x){
            System.out.println("y is bigger");
        } else{
            System.out.println("x = y");
        }
        */


        // switch-case

        int day = 2;
        String dayString = "";

        switch (day){
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            default:
                dayString = "Sunday";
        }
        System.out.println(dayString);




    }
}
