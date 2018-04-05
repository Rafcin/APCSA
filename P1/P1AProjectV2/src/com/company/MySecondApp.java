package com.company;

public class MySecondApp {

    static int defaultInt;
    static double defaultDouble;
    static String defaultString;
    static boolean defaultBoolean;

    public static void main(String[] args) {

        boolean favBoolean = true;
        double favDouble = Math.PI;
        String favString = "gnirtS";
        int favInt = -10;


//        while(favDouble>0){
//            System.out.println(favDouble%10);
//            favDouble=favDouble/10;
//
//        }

        System.out.println("---------------------------------");


        System.out.println("Def is:" + defaultBoolean);
        System.out.println("Def is: " + defaultDouble);
        System.out.println("Def is: " + defaultInt);
        System.out.println("Def is: " + defaultString);

        System.out.println("---------------------------------");


        System.out.println("Fav is: " + favBoolean);
        System.out.println("Fav is: " + favDouble);
        System.out.println("Fav is: " + favInt);
        System.out.println("My favorite string is: " + favString);

        System.out.println("---------------------------------");


    } //end main method
} // end class MySecondApp
