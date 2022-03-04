package com.yasincuren.javalearning2;

public class Loops {

    public static void main(String[] args){

        //for loops

        int[] myNumbers = {12,15,18,21,24};

        for(int i=0; i<myNumbers.length;i++){

            int x = myNumbers[i] / 3 * 5;
            //System.out.println(x);
        }

        //for loops v2 (farklı gösterim)

        for(int number: myNumbers){
            System.out.println(number/ 3 * 5);
        }


        //while loops

        int j=0;
        while (j<10){
            System.out.println("test");

            j++;
        }


    }
}
