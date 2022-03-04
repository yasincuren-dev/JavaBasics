package com.yasincuren.javalearning2;

public class Variables {

    public static void main(String[] args){

        //Variables

        //Integer - Long
        int x = 20;
        int y = 3;
        //System.out.println(x/y);


        //Doubles - Float
        double z = 20;
        double d = 3;
        //System.out.println(z/d);


        //String
        String name = "Yasin";
        String surname = "Çüren";
        String fullname = name + " " +surname;
        //System.out.println(fullname);


        //Boolean
        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);

        //Final

        final int myFinal = 5;
        System.out.println("myFinal: "+ myFinal);

        //myFinal = 4; >> bunu yapamıyoruz çünkü final değişkenini değiştiremiyoruz.


    }
}
